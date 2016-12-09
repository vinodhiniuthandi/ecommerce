package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CategoryDao;
import com.niit.backend.model.Category;

public class CategoryTest {

	 public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		CategoryDao categoryDao= (CategoryDao) context.getBean("categoryDaoimpl");
		Category category = (Category) context.getBean("category");	
		category.setId("CT01");
		category.setName("laptop");
		category.setDescription("This is electronics ");
		categoryDao.saveorupdate(category);
		 System.out.println( "objects are created successfully");
	}
}