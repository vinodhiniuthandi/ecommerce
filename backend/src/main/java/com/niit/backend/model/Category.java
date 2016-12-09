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

@Entity
@Table(name="CATEGORY")/*in h2 category table=name*/
@Component
public class Category implements Serializable{
@Id
@NotBlank(message="Please give a CATEGORY ID")
	private String id;
@NotBlank(message="Please give a category name")
	private String name;
@NotBlank(message="Please give a category desc")
	private String description;
	
	/*mapping new name in description(instead of description some thing like "desc" )column in database @column(name="description")*/
	@Transient
	private Set<Product> products;
	@OneToMany(mappedBy ="category",fetch=FetchType.EAGER)
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category() {
		this.id="CAT"+UUID.randomUUID().toString().substring(24).toUpperCase();
	}

	}
	

