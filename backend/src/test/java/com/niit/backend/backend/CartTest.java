package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CartDao;
import com.niit.backend.model.Cart;


public class CartTest {

	 public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		CartDao cartDao = (CartDao) context.getBean("cartDaoimpl");
		Cart cart=(Cart) context.getBean("cart");
	
System.out.println( "objects are created successfully");
	}
}
