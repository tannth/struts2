package action;

import util.DBOperators;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;

public class RegisterAccountAction extends ActionSupport implements
		ValidationAware {
	private String username, password, confirm, lastname, emailID, phoneNo;

	@Override
	public String execute() throws Exception {
		boolean result = DBOperators.registerAccount(this);
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
