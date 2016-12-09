package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.ProductDao;
import com.niit.backend.model.Product;

public class ProductTest {
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		ProductDao productDao=(ProductDao) context.getBean("productdaoimpl");
	Product product = (Product) context.getBean("product");
	product.setCategory("laptop");
	product.setProduct_Id("01");
	product.setProduct_Name("Dell");
	product.setProduct_Price(35000);
	product.setProduct_Stock(10);;
	product.setSupplier_Name("karthi");
product.setDescription("LapTop");
	productDao.saveOrUpdate(product);
	 System.out.println( "objects are created successfully");
	
}
}
