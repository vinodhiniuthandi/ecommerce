package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.Cart;
@Repository
public interface CartDao {

	public List<Cart> list(String id);
	
	public Cart get(String id);
	
	public void saveOrUpdate(Cart cart);
	
	public void delete(int id);
		
	public Long getTotalAmount(String id);
	
	public Long getCount(String id);
	
}

