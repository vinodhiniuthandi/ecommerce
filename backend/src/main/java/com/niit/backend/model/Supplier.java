package com.niit.backend.model;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="supplier")
@Component
public class Supplier implements Serializable{
private static final String Image = null;
@Id
private String id;
@NotBlank(message="Please give a supplier name")
private String name;
@NotBlank(message="Enter a contact no")
private String contact;
@NotBlank(message="Enter a email Id")
private String Email;
@NotBlank(message="Give supplier a address")
private String address;
@Transient
private MultipartFile supplierImage;
@Transient
private Set<Product> products;
@OneToMany(mappedBy="supplier",fetch=FetchType.EAGER)
public String getId() {
	return id;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public MultipartFile getSupplierImage() {
	return supplierImage;
}
public void setSupplierImage(MultipartFile supplierImage) {
	this.supplierImage = supplierImage;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String toString() {
	
return "Supplier [Id=" + id + ", Name=" + name + ", Contact="
			
	+ contact + ", Email=" + Email + ", Address=" + address
		
		+ ", image=" + Image + "]";
}
public Supplier() {
	this.id="SUPP"+UUID.randomUUID().toString().substring(24).toUpperCase();
}

}
