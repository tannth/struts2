package factory;

import oracle_daosessionbean.AccountDAOImpl;
import oracle_daosessionbean.EmployeeDAOImpl;
import mod_biz_api.AccountDAO;
import mod_biz_api.AccountRoleDAO;
import mod_biz_api.ArticleDAO;
import mod_biz_api.ArticleRateDAO;
import mod_biz_api.ComplaintDAO;
import mod_biz_api.ConplaintCategoryDAO;
import mod_biz_api.ConplaintReplyDAO;
import mod_biz_api.DepartmentDAO;
import mod_biz_api.EmployeeDAO;
import mod_biz_api.JobDAO;
import mod_biz_api.ParameterDAO;
import mod_biz_api.RoleDAO;

public class OracleDAOFactory extends DAODatabaseAbstractFactory {
	/* private static Context ctx = null; */

	// method to create Cloudscape connections
	/*
	 * public static Context createConnection(String appName, String moduleName,
	 * String beanName, String interfaceName) { try { ctx =
	 * ServiceLookup.getInitialContext();
	 * 
	 * String lookupName = ServiceLookup.getLookupName(appName, moduleName,
	 * beanName, interfaceName);
	 * 
	 * } catch (NamingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return ctx; }
	 */

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new AccountDAOImpl();
	}

	@Override
	public AccountRoleDAO getAccountRoleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleDAO getArticleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleRateDAO getArticleRateDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComplaintDAO getComplaintDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConplaintCategoryDAO getConplaintCategoryDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConplaintReplyDAO getConplaintReplyDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentDAO getDepartmentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDAO getEmployeeDAO() {
		// TODO Auto-generated method stub
		return new EmployeeDAOImpl();
	}

	@Override
	public JobDAO getJobDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParameterDAO getParameterDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleDAO getRoleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
