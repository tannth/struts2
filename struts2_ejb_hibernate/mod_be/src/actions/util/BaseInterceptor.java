package actions.util;

import factory.DAODatabaseAbstractFactory;

public abstract class BaseInterceptor {
	protected DAODatabaseAbstractFactory instanceDAO = null;

	public BaseInterceptor() {
		instanceDAO = DAODatabaseAbstractFactory
				.getDAODatabaseFactory(DAODatabaseAbstractFactory.ORACLE);
	}
}
