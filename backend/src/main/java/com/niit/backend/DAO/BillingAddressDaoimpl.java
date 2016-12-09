package com.niit.backend.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.BillingAddress;

@Repository("billingAddressDaoimpl")
@Transactional
public class BillingAddressDaoimpl implements BillingAddressDao{
@Autowired

SessionFactory sessionFactory;
public BillingAddressDaoimpl (SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
	public void deleteBillingAddress(String BillingAddressid) {
		BillingAddress billingAddressToDelete = new BillingAddress();
		billingAddressToDelete.setBillingAddressid(BillingAddressid);
		sessionFactory.getCurrentSession().delete(billingAddressToDelete);
	}
@Transactional
	public BillingAddress getBillingAddress(String BillingAddressid) {
	return (BillingAddress) sessionFactory.getCurrentSession().get(BillingAddress.class, BillingAddressid);
		}
@Transactional
	public void saveOrUpdate(BillingAddress billingaddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(billingaddress);
		
	}



}

