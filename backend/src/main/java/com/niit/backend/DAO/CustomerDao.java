package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.Customer;
@Repository
public interface CustomerDao {
	void saveOrUpdate(Customer customer);
	
	
	Customer get(String customerId);
		
		
	List<Customer> listCustomer();
		
		
	Customer getCustomerByUserName(String userName);
}
