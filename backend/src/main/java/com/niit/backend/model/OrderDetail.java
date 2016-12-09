package com.niit.backend.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class OrderDetail implements Serializable {

	
	@Id
	private String OrderDetailid;
	private String customerId;
	
      private double grandTotal;
		

	private String shippingAddressId;
		
	private String billingAddressId;

	public String getOrderDetailid() {
		return OrderDetailid;
	}

	public void setOrderDetailid(String orderDetailid) {
		OrderDetailid = orderDetailid;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public String getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public OrderDetail() {
		this.OrderDetailid = "OD" + UUID.randomUUID().toString().substring(24).toUpperCase();
		
	}


}
