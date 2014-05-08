package actions.account;

import java.util.Map;

import javax.naming.Context;

import org.apache.struts2.interceptor.SessionAware;

import actions.util.BaseAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import entites.Account;
import mod_biz_api.AccountDAO;
import mssql_daosessionbbean.AccountDAOSQLServerImpl;
import oracle_daosessionbean.AccountDAOImpl;
import service.ServiceLookup;

public class AccountAction extends BaseAction implements ModelDriven,
		SessionAware {

	private static final long serialVersionUID = 9096347633297461574L;
	private Account account = new Account();

	private Map<String, Object> session = ActionContext.getContext()
			.getSession();

	@Override
	public void setSession(Map<String, Object> sess) {
		this.session = sess;
	}

	public String login() throws Exception {

		Context ctx = ServiceLookup.getInitialContext();

		String lookupName = ServiceLookup.getLookupName(
				AccountDAOImpl.class.getSimpleName(),
				AccountDAO.class.getName());

		AccountDAO accountDAO = instanceDAO.getAccountDAO();
		accountDAO = (AccountDAO) ctx.lookup(lookupName);

		Account sessionAccount = (Account) session.get("account");
		if (sessionAccount != null) {
			return SUCCESS;
		} else {

			Account a = (Account) accountDAO.checkLogin(account.getUsername(),account.getPassword());
			if (a != null) {
				session.put("account", a);
				return SUCCESS;
			} else {
				addActionError("Account with username: "
						+ account.getUsername() + " is not founded.");
			}
			return INPUT;
		}
	}

	public String logout() throws Exception {
		session.remove("account");
		return SUCCESS;
	}

	public String register() throws Exception {
		Context ctx = ServiceLookup.getInitialContext();

		String lookupName = ServiceLookup.getLookupName(
				AccountDAOImpl.class.getSimpleName(),
				AccountDAO.class.getName());

		return SUCCESS;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return account;
	}

}
