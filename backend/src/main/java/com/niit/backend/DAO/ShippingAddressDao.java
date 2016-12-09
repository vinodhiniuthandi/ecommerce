package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.ShippingAddress;

public interface ShippingAddressDao {
public List<ShippingAddress> list(String id);
	
	public ShippingAddress get(String name);
	
	public void saveOrUpdate(ShippingAddress shippingAddress);
	
	public void delete(String id);
	
	public void editShippingAddress(ShippingAddress shippingAddress);
	

}
