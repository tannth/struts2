package factory;

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

public abstract class DAODatabaseAbstractFactory {
	public static final int MSSQL = 1;
	public static final int ORACLE = 2;

	public DAODatabaseAbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	public abstract AccountDAO getAccountDAO();

	public abstract AccountRoleDAO getAccountRoleDAO();

	public abstract ArticleDAO getArticleDAO();

	public abstract ArticleRateDAO getArticleRateDAO();

	public abstract ComplaintDAO getComplaintDAO();

	public abstract ConplaintCategoryDAO getConplaintCategoryDAO();

	public abstract ConplaintReplyDAO getConplaintReplyDAO();

	public abstract DepartmentDAO getDepartmentDAO();

	public abstract EmployeeDAO getEmployeeDAO();

	public abstract JobDAO getJobDAO();

	public abstract ParameterDAO getParameterDAO();

	public abstract RoleDAO getRoleDAO();

	public static DAODatabaseAbstractFactory getDAODatabaseFactory(
			int whichFactory) {
		switch (whichFactory) {
		case MSSQL:
			return new MSSQLDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
		default:
			return null;
		}
	}
}
