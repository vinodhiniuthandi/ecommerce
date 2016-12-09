package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.Product;

@Repository
public interface ProductDao {

	
public List<Product> list();

public List<Product> list(String category);

public Product get(String product_Id);

public void saveOrUpdate(Product product);

public void delete(String product_Id);
}
