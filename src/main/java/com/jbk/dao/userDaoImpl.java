package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Repository;

import com.jbk.dto.loginRequest;
import com.jbk.entities.user;
import com.jbk.exceptions.ResourceNotFoundException;
@Repository
public class userDaoImpl implements userDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	public  int  createUser(user user) {
		

		try {
			Session session=sessionFactory.openSession();
			user dbuser =session.get(user.class, user.getUsername());
			if(dbuser==null)
			{
			session.save(user);
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


	@Override
	public user getuserByUsername(String username) {
		user user=null;
		
		try {
			Session session=sessionFactory.openSession();
			user=session.get(user.class, username);
			 if(user!=null)
			 {
				  return user;
			 }
			 else
			 {
				  throw new ResourceNotFoundException("user not exists"+username);
			 }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}


	@Override
	public int deleteuser(String username) {
		try {
			Session session=sessionFactory.openSession();
		user user=	session.get(user.class, username);
		if (user != null) {/* null nahi aahe */
		session.delete(user);
         session.beginTransaction().commit();
         return 1;
		}
		else
		{
			return 2;
			
		}
		} catch (Exception e) {
			e.printStackTrace();
			return 3;
		}
		
	}


	@Override
	public user loginuser(loginRequest loginRequest) {
		try {
			Session session=sessionFactory.openSession();
			user dbuser=session.get(user.class,loginRequest.getUsername());
			if(dbuser!=null)
			{
				
				if(dbuser.getPassword().equals(loginRequest.getPassword()))
				{
					return dbuser;
					
				}
			}
			else
			{
				return null;
			}
			
		} catch (Exception e) {
			
		}
		
		
		return null;
	}
}
