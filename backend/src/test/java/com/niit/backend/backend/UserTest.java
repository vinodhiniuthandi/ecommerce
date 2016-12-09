package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.UserDao;
import com.niit.backend.model.User;

public class UserTest {
	
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
        UserDao userDao = (UserDao) context.getBean("userDaoimpl");
        User user = (User) context.getBean("user");
      user.setEmail("admin");
      user.setName("admin");
      user.setPassword("admin");
      user.setMobile("9600292813");
      user.setRole("ROLE_ADMIN");
      user.setAddress("chennai");
     user.setEnabled(true);
    userDao.saveorupdate(user);
    
        
		 System.out.println( "Details are created successfully");
	}

}
