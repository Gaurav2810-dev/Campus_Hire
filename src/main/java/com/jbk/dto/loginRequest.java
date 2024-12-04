package com.jbk.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class loginRequest {
	private String username;
	private String password;
	
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
	public loginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public loginRequest() {
		super();
	
	}
	@Override
	public String toString() {
		return "loginRequest [username=" + username + ", password=" + password + "]";
	}

}
