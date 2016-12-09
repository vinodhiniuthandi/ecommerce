package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;

@Repository("supplierdaoimpl")
@Component

@Transactional
public class SupplierDaoimpl implements SupplierDao {
@SuppressWarnings("unused")
@Autowired
private Supplier supplier;
@Autowired
private SessionFactory sessionFactory;

public SupplierDaoimpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

@Transactional

	public boolean update(Supplier supplier) {
		
	try {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public Supplier get(String id) {
		String hql = "from Supplier where id = '" + id +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Supplier> list =query.list();
		
		if(list !=null || list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}

	public List<Supplier> list() {
		
		@SuppressWarnings({ "unchecked" })
		List<Supplier> listSupplier = (List<Supplier>)
		sessionFactory.getCurrentSession().createCriteria(Supplier.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;

	}
	@Transactional
	public void delete(String id) {
		Supplier supplierToDelete = new Supplier();
		supplierToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(supplierToDelete);
	}
	public void saveorupdate(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	}

}
