package struts2basic;

public class AccountDTO {
	private String username;
	private String password;
	private String lastname;
	private String roles;

	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}

	public AccountDTO(String username, String password, String lastname,
			String roles) {
		super();
		this.username = username;
		this.password = password;
		this.lastname = lastname;
		this.roles = roles;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}
