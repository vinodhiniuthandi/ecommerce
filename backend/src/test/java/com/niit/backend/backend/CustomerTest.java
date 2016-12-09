package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CustomerDao;
import com.niit.backend.model.Customer;

public class CustomerTest {

	

	 public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		CustomerDao customerdao = (CustomerDao) context.getBean("customerDaoimpl");
		Customer customer=(Customer) context.getBean("customer");
		
		customer.setCustomerid("cu12");
		customer.setUsername("jithu108@gmail.com");
		customer.setPassword("password");
		customer.setGender("male");
		customer.setPhoneNo("9600292813");
		customerdao.saveOrUpdate(customer);
	}
	 
}
