package com.jbk.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.userDao;
import com.jbk.dao.userDaoImpl;
import com.jbk.dto.loginRequest;
import com.jbk.entities.user;
@Service
public class userServiceImpl  implements UserService{
	@Autowired
	userDao userDao;
	@Override
	public int createUser(user user) {
	
		int status=userDao.createUser(user);
		return status;
	}
	@Override
	public user getuserByUsername(String username) {
	user user=userDao.getuserByUsername(username);
		return user;
	}
	@Override
	public int deleteuser(String username) {
		int user=userDao.deleteuser(username);
		return user;
	}
	@Override
	public user loginuser(loginRequest loginRequest) {
		user user=userDao.loginuser(loginRequest);
		return user;
	}
	
	


}
