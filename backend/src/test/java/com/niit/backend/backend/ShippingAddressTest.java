package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.ShippingAddressDao;
import com.niit.backend.DAO.UserDao;
import com.niit.backend.model.ShippingAddress;
import com.niit.backend.model.User;

public class ShippingAddressTest {

	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
        ShippingAddressDao shippingAddressDao = (ShippingAddressDao) context.getBean("shippingAddressDao");
        ShippingAddress shippingAddress =  (ShippingAddress) context.getBean("shippingAddress");
        shippingAddress.setId("1");
        shippingAddress.setEmail("jithu108@gmail.com");
        shippingAddress.setAddress("chennai");
        shippingAddress.setName("jithu");
        shippingAddress.setPhoneNo("9600292813");
  
        shippingAddress.setZipCode("6291678");
        shippingAddressDao.saveOrUpdate(shippingAddress);
        System.out.println( "Details are created successfully");
   
}
}