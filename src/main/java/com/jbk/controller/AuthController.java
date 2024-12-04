package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.dto.loginRequest;
import com.jbk.entities.user;
import com.jbk.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserService userService;
  @PostMapping("/login-user")
  public Object loginUser(@RequestBody loginRequest loginRequest)
  {
	try {
		 user user=userService.loginuser(loginRequest);
		 if(user!=null)
		 {
			 return user;
			 
		 }
		 else
		 {
			 return "Invalid credientials";
			 		
		 }
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	  
	return null;
	  
  }
}
	