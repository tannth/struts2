package mssql_daosessionbbean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import base.BaseAbstract;
import mod_biz_api.AccountDAO;
import model.Account;

/**
 * Session Bean implementation class AccountDAOImpl
 */
@Stateless
@Remote(AccountDAO.class)
public class AccountDAOSQLServerImpl extends BaseAbstract implements AccountDAO {
	/* AccountDAO accountDAO; */

	public AccountDAOSQLServerImpl() {
		super();
		/* accountDAO = oracleFactory.getAccountDAO(); */
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findByID(String id) {
		// TODO Auto-generated method stub
		return em1.find(Account.class, id);
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
