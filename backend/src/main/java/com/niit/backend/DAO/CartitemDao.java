package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.CartItem;
@Repository
public interface CartitemDao {

	public void saveOrUpdate(CartItem cartItem);

	


	public void delete(String cartItemId);

		

	CartItem getCartItem(String cartItemId);



	List<CartItem> getCartItemsByCustomerId(String customerId);



	List<CartItem> listCartItems();

}
