package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CartitemDao;
import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;

public class CartItemTest {

	 public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		CartitemDao cartitemDao = (CartitemDao) context.getBean("cartitemdaoimpl");
		CartItem cartItem=(CartItem) context.getBean("cartItem");
				cartItem.setCartId("12");
		cartItem.setCartItemId("11");
		cartItem.setCustomerId("cu12");
		cartItem.setProductId("PD4");
		cartItem.setQuantity(5);
		cartItem.setTotalPrice(10000);
		cartitemDao.saveOrUpdate(cartItem);
		System.out.println( "objects are created successfully");
	}
}
