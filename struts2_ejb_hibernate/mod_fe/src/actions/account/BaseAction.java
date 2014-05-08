package actions.account;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;

import factory.DAODatabaseAbstractFactory;

public abstract class BaseAction extends ActionSupport {
	DAODatabaseAbstractFactory instanceDAO = null;

	public BaseAction() {
		instanceDAO = DAODatabaseAbstractFactory
				.getDAODatabaseFactory(DAODatabaseAbstractFactory.ORACLE);
	}
}
