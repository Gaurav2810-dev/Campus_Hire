package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entities.student;
import com.jbk.service.studentService;
@RestController
@RequestMapping("/student")
public class studentController {
  @Autowired
  studentService studentService;
  
  @PostMapping("/create_student")
  public String createStudent(@RequestBody student student)
  {
	 int status=  studentService.createStudent(student);
	
	switch (status) {
	case 1:
		return" student added sucessdully...";
	case 2:
		 return"student already exists";
	case 3:
		return "something went wrong";
		

	default:
		
		return " ";
	}
	  
  }
}
