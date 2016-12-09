package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.BillingAddressDao;
import com.niit.backend.model.BillingAddress;

public class BillingAddressTest {

	
		 public static void main( String[] args )
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.backend");
			context.refresh();
			BillingAddressDao billingaddressdao=(BillingAddressDao) context.getBean("billingAddressDaoimpl");
				BillingAddress billingaddress=(BillingAddress) context.getBean("billingAddress");	
				billingaddress.setCustomerId("cu12");
				billingaddress.setBillingAddressid("45");
				billingaddress.setLine1("kovai");
				billingaddress.setCountry("india");
				billingaddress.setState("tn");
				billingaddress.setCity("chennai");
				billingaddress.setZipcode("656567");
				billingaddressdao.saveOrUpdate(billingaddress);
				//billingaddressdao.deleteBillingAddress("er32");
			//billingaddressdao.getBillingAddress("45");
				System.out.println( "objects are created successfully");
				
		}
	
		 
		 
}
