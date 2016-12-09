package com.niit.backend.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Entity
@Table(name="billingaddress")
@Component
public class BillingAddress implements Serializable {
	@Id
	private String BillingAddressid;
	private String customerId;
	@NotBlank(message="specify main address ")
	private String line1;
	@NotBlank(message="specify city")
	private String city;
	@NotBlank(message="specify country")
	private String country;
	@NotBlank(message="specify state")
	private String state;
	@NotBlank(message="specify zipcode")
	private String zipcode;
	public String getBillingAddressid() {
		return BillingAddressid;
	}
	public void setBillingAddressid(String billingAddressid) {
		BillingAddressid = billingAddressid;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public BillingAddress() {
		this.BillingAddressid = "BILL" + UUID.randomUUID().toString().substring(24).toUpperCase();
	}
	

}
