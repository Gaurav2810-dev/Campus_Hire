package com.jbk.service;

import com.jbk.dto.loginRequest;

import com.jbk.entities.user;

public interface UserService {

	public  int  createUser(user user);
	
	public user getuserByUsername(String username);
	
	public int deleteuser(String username);

	public user loginuser(loginRequest loginRequest);

	
	
}
