package action;

import util.DBOperators;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAccountAction extends ActionSupport {
	private String username;

	public DeleteAccountAction() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		boolean result = DBOperators.deleteAccount(username);
		if (result) {
			return DBOperators.SUCCESS;
		}
		return DBOperators.FAIL;
	}
}
