package actions.util;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entites.Employee;

public class LinkAction extends ActionSupport {
	private List<Employee> listEmployee;

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public String employee() {
		System.out.println("employee");
		return "employee";
	}

	public String deparment() {
		System.out.println("deparment");
		return "deparment";
	}
}
