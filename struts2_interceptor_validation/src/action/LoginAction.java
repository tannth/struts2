package action;

import java.util.Map;

import util.DBOperators;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;

	public LoginAction() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String execute() throws Exception {

		boolean result = DBOperators.checkLogin(username, password);

		if (result) {
			Map session = ActionContext.getContext().getSession();
			session.put("USER", username);
			return DBOperators.SUCCESS;
		}
		return DBOperators.FAIL;
	}

	@Override
	public void validate() {
		if (this.username.length() == 0) {
			addFieldError("username", "Username is required");
		} else if (this.username.length() < 4) {
			addFieldError("username", "Username is very short");
		}
		if (this.password.length() == 0) {
			addFieldError("password", "Password is required");
		}
	}
}
