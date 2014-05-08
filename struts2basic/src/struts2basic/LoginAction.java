package struts2basic;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private final String SUCCESS = "success";
	private final String FAIL = "fail";
	private String username;
	private String password;

	public LoginAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {

		boolean result = DBOperation.checkLogin(username, password);
		if (result) {
			Map session = ActionContext.getContext().getSession();
			session.put("USER", username);
			return SUCCESS;
		}
		return FAIL;
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

}
