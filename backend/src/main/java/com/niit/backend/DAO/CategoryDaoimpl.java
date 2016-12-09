package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Category;
@Repository
@Component
public class CategoryDaoimpl implements CategoryDao  {

	@Autowired
	private Category category;
	
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	 @Transactional
	public boolean save(Category category) {
	
		try
		{
		sessionFactory.getCurrentSession().save(category);
		return true;
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		return false;
		}
		
	}
	 @Transactional
	public boolean update(Category category) {
		
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		return false;
		}
		
	}
		
	
   
   @Transactional
	public Category get(String id) {

		//select * from catogory where id='101';
		String hql=" from Category where id= "+"'"+id+"'";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
    
@SuppressWarnings("unchecked")
@Transactional
	public List<Category> list() {
		
	@SuppressWarnings({ "unchecked" })
	List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	return listCategory;
			
		
	
}
@Transactional
public boolean saveorupdate(Category category) {
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
	return true;
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	return false;
	}
}
@Transactional
public void delete(String id) {
	Category categoryToDelete = new Category();
	categoryToDelete.setId(id);
	sessionFactory.getCurrentSession().delete(categoryToDelete);
}
}
