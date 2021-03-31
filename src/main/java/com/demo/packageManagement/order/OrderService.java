package com.demo.packageManagement.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class OrderService {
	@Autowired
	private OrderDao orderDao;
	public Iterable<Order> findAll(String customerId) {
		if(customerId!=null) {
			return orderDao.findByCustomerId(customerId);
		}
		return orderDao.findAll();
	}
	public Order findOne(String packageId) {
		return orderDao.findOne(packageId);
	}
	
	public void add( Order order) {
		orderDao.save(order);
	}
	
	//TODO: 更新时应该检验 ID
	public void update(String packageId, Order order) {
		orderDao.save(order);
	}
	
	public void delete(String packageId) {
		orderDao.delete(packageId);
	}
	
	
}
