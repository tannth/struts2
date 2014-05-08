package action;

import util.DBOperators;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAccountAction {
	private String username;
	private String password;
	private boolean roles;

	public UpdateAccountAction() {
		// TODO Auto-generated constructor stub
	}

	public String update() throws Exception {
		boolean result = DBOperators.updateAccount(username, password, roles);
		if (result) {
			return DBOperators.SUCCESS;
		}
		return DBOperators.FAIL;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRoles() {
		return roles;
	}

	public void setRoles(boolean roles) {
		this.roles = roles;
	}

}
