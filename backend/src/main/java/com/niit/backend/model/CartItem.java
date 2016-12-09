package com.niit.backend.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cartItem")
@Component
public class CartItem implements Serializable{
	@Id
	private String cartItemId;
	
	
private String cartId;
	
private String customerId;
	
private String productId;
	
private int quantity;
	
private double totalPrice;

public String getCartItemId() {
	return cartItemId;
}

public void setCartItemId(String cartItemId) {
	this.cartItemId = cartItemId;
}

public String getCartId() {
	return cartId;
}

public void setCartId(String cartId) {
	this.cartId = cartId;
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

public CartItem() {
	this.cartItemId ="CRTITEM" +UUID.randomUUID().toString().substring(24).toUpperCase();
	
}

}
