package actions.account;

import java.util.Map;

import javax.naming.Context;

import com.opensymphony.xwork2.ActionContext;

import entites.Account;
import mod_biz_api.AccountDAO;
import mssql_daosessionbbean.AccountDAOSQLServerImpl;
import oracle_daosessionbean.AccountDAOImpl;
import service.ServiceLookup;

public class AccountAction extends BaseAction {
	private String username;
	private String password;

	public String authenticate() throws Exception {
		System.out.println("Username: " + username);

		Context ctx = ServiceLookup.getInitialContext();

		String lookupName = ServiceLookup.getLookupName(
				AccountDAOImpl.class.getSimpleName(),
				AccountDAO.class.getName());

		/*
		 * String lookupName1 = ServiceLookup.getLookupName(
		 * AccountDAOSQLServerImpl.class.getSimpleName(),
		 * AccountDAO.class.getName());
		 */

		AccountDAO accountDAO = instanceDAO.getAccountDAO();

		accountDAO = (AccountDAO) ctx.lookup(lookupName);

		Account account = (Account) accountDAO.findByID(username);
		if (account != null) {
			Map session = ActionContext.getContext().getSession();
			session.put("USER", username);
			return "success";
		}
		return "error";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
