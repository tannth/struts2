package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

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

public class MSSQLDAOFactory extends DAODatabaseAbstractFactory {
	/*
	 * public static final String DRIVER = "COM.cloudscape.core.RmiJdbcDriver";
	 * public static final String DBURL =
	 * "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";
	 */
	// method to create Cloudscape connections
	public static Connection createConnection() {
		// Use DRIVER and DBURL to create a connection
		// Recommend connection pool implementation/usage

		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("");

			Connection cn = ds.getConnection();
			return cn;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return null;
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
		return null;
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
