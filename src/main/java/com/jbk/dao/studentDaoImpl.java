package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.student;
@Repository

public class studentDaoImpl implements studentDao {

	
	@Autowired
	 private SessionFactory sessionFactory;
	@Override
	public int createStudent(student student) {
		try {
			
			Session session=sessionFactory.openSession();
		student dbstudent=session.get(student.class, student.getId());
			if(dbstudent==null)
			{
				
			session.save(student);
			session.beginTransaction().commit();
			
			return 1;
			
			}
			else
			{
				return 2;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 3;
	}

}
