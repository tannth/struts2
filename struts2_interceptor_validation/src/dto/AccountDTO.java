package dto;

public class AccountDTO {
	private String username, password, lastname;
	private boolean roles;

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

	public boolean isRoles() {
		return roles;
	}

	public void setRoles(boolean roles) {
		this.roles = roles;
	}

	public AccountDTO(String username, String password, String lastname,
			Boolean roles) {
		super();
		this.username = username;
		this.password = password;
		this.lastname = lastname;
		this.roles = roles;
	}

	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}
}
