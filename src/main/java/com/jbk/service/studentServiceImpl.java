package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.studentDao;
import com.jbk.entities.student;
import com.jbk.entities.user;
@Service
public class studentServiceImpl implements studentService {
 @Autowired
 studentDao studentDao;
 
	@Override
	public int createStudent(student student) {
		 int status=studentDao.createStudent(student);
		return status;
	}

	

}
