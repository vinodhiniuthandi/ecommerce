package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.OrderDetail;

@Repository("orderDetailDao")
public class OrderDetailDaoimpl implements OrderDetailDao {
	
	
	
	SessionFactory sessionFactory;

	public void saveOrUpdate(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String orderDetailId) {
		// TODO Auto-generated method stub
		
	}

	public List<OrderDetail> listOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
