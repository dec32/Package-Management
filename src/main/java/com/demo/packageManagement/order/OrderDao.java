package com.demo.packageManagement.order;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface OrderDao extends CrudRepository<Order, String>{
	public Iterable<Order> findByCustomerId(String customerId);
}
