package oracle_daosessionbean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import base.BaseAbstract;
import mod_biz_api.AccountDAO;
import entites.Account;
import entites.Employee;

/**
 * Session Bean implementation class AccountDAOImpl
 */
@Stateless
@Remote(AccountDAO.class)
public class AccountDAOImpl extends BaseAbstract implements AccountDAO {
	/* AccountDAO accountDAO; */

	public AccountDAOImpl() {
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
		return em.find(Account.class, id);
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
		TypedQuery<Account> query = em.createNamedQuery("Account.checkLogin",
				Account.class);
		query.setParameter("username", username);
		query.setParameter("password", password);

		List<Account> list = query.getResultList();
		if (list.size() > 0) {
			Account result = list.get(0);
			return result;
		}
		return null;
	}

}
