package oracle_daosessionbean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entites.Employee;
import base.BaseAbstract;
import mod_biz_api.EmployeeDAO;

/**
 * Session Bean implementation class EmployeeDAOImpl
 */
@Stateless
@Remote(EmployeeDAO.class)
public class EmployeeDAOImpl extends BaseAbstract implements EmployeeDAO {

	/**
	 * Default constructor.
	 */
	public EmployeeDAOImpl() {
		// TODO Auto-generated constructor stub
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
	public Employee findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findAll() {
		return em.createNamedQuery("Employee.findAll")
				.getResultList();
	}

	@Override
	public Object findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
