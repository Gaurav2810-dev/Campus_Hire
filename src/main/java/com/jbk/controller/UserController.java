package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entities.user;
import com.jbk.exceptions.ResourceNotFoundException;
import com.jbk.service.UserService;
import com.jbk.service.userServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService UserService;

	@PostMapping("/create_user")
	public String createuser(@RequestBody @Valid user user) {
		int status = UserService.createUser(user);
		switch (status) {
		case 1: {

			return "user added sucessfully";
		}
		case 2: {

			return "user already exists";
		}
		case 3: {

			return "Something went wrong";
		}
		default:

			return " ";
		}
	}

	@GetMapping("/by_username/{username}") /* {}--> PlaceHolder */
	
	
	  public Object getuserByUsername(@PathVariable String username) {
	  
	  
	  user user = UserService.getuserByUsername(username); if (user != null)
	  {
	  return user; 
	  } 
	  else
	  { throw new ResourceNotFoundException("User Not Found for username =  " + username);
	  }
	}
	 
	 
	
	/*
	 * public user getuserByUsername(@PathVariable String username) {
	 * 
	 * user user = UserService.getuserByUsername(username); return user; }
	 */

	@DeleteMapping("/delete-user")
	public String Deleteuser(@RequestParam String username) {
		int user = UserService.deleteuser(username);

		switch (user) {
		case 1: {

			return "deleted sucessfully...";
		}
		case 2: {

			return "user not exists...";
		}
		case 3: {

			return "something went wrong";
		}
		default:
			return " ";
		}

	}

}
