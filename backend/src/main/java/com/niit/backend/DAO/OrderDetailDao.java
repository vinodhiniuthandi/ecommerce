package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.OrderDetail;

public interface OrderDetailDao {
	void saveOrUpdate(OrderDetail orderDetail);

	

	void delete(String orderDetailId);

		
	List<OrderDetail> listOrderDetails();


}
