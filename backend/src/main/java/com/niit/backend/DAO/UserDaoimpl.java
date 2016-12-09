package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.User;

@Repository
@Transactional
public class UserDaoimpl implements UserDao {
	Logger log = LoggerFactory.getLogger(User.class);
	 
	@Autowired
	private SessionFactory sessionFactory;


	public UserDaoimpl(SessionFactory sessionFactory) {
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			log.error(" Unable to connect to db");
			e.printStackTrace();
		}
	}


@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

@Transactional
	public User get(String email) {
	String hql = "from User where email=" + "'"+ email+"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<User> list = (List<User>) query.list();
	
	if (list != null && !list.isEmpty()) {
		return list.get(0);
	}
	
	return null;
}

@Transactional
	public void delete(User user) {
	try
	{
	sessionFactory.getCurrentSession().delete(user);

	}
	catch(HibernateException e)
	{
	e.printStackTrace();
	}
}

@Transactional
	public User isvalidUser(String email, String password) {
	String hql = "from User where email= '" + email + "' and " + " password ='" + password+"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<User> list = (List<User>) query.list();
	
	if (list != null && !list.isEmpty()) {
		return list.get(0);
	}
	
	return null;
}


@Transactional
	public boolean isAlreadyRegister(String email, boolean b) {
	String hql = "from User where email ='"+ email +"'";
	
	
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> list = (List<User>) query.list();
	if (list != null && !list.isEmpty()) {
		return true;
	}
	return false;
}
@Transactional

public void saveorupdate(User user) {
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
	
}
}