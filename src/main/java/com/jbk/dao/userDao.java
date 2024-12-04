package com.jbk.dao;

import com.jbk.dto.loginRequest;

import com.jbk.entities.user;



public interface userDao {


	public  int  createUser(user user);
	
	public user getuserByUsername(String username);
	
	public int deleteuser(String username);

	public user loginuser(loginRequest loginRequest);
	
	
	
	
}
