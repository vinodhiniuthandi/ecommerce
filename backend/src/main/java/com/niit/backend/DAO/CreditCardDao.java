package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.CreditCard;
@Repository
public interface CreditCardDao {
public List<CreditCard> list();
	
	public CreditCard get(String id);
	
	public void saveOrUpdate(CreditCard creditcard);
	
	public void delete(String id);
	
	public void editCreditCard(CreditCard creditcard);

}
