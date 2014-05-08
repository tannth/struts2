package actions.employee;

import java.util.List;

import javax.naming.Context;
import javax.naming.NamingException;

import mod_biz_api.EmployeeDAO;
import oracle_daosessionbean.EmployeeDAOImpl;
import service.ServiceLookup;
import actions.util.BaseAction;
import entites.Employee;

public class EmployeeAction extends BaseAction {
	private List<Employee> listEmployee;

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public String displayAll() throws Exception {
		Context ctx;
		ctx = ServiceLookup.getInitialContext();

		String lookupName = ServiceLookup.getLookupName(
				EmployeeDAOImpl.class.getSimpleName(),
				EmployeeDAO.class.getName());
		EmployeeDAO employeeDAO = instanceDAO.getEmployeeDAO();

		employeeDAO = (EmployeeDAO) ctx.lookup(lookupName);

		listEmployee = employeeDAO.findAll();

		return "displayAll";
	}

}
