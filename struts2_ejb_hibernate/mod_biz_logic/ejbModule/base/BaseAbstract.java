package base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import factory.DAODatabaseAbstractFactory;

public abstract class BaseAbstract {
	@PersistenceContext(unitName = "manager")
	protected EntityManager em;
	
	@PersistenceContext(unitName = "manager1")
	protected EntityManager em1;

	public BaseAbstract() {

	}
}
