package com;

import com.opensymphony.xwork2.ModelDriven;

public class Login implements ModelDriven<User> {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public String execute() {
		if (user.getPassword().equals("admin")) {
			return "success";
		} else {
			return "error";
		}
	}

}
