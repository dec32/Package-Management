package com.demo.packageManagement.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public Iterable<Customer> findAll(){
		return customerDao.findAll();
	}
	
	public Customer findOne(String id) {
		return customerDao.findOne(id);
	}
	
	public void delete(String id) {
		customerDao.delete(id);
	}
	
	public void add(Customer customer) {
		customerDao.save(customer);
	}
	
	public void update(String customerId, Customer customer) {
		//当传入的新对象的 id 与原有对象的 id 不一致时，应当拒绝修改
		if(!customerId.equals(customer.getCustomerId())) {
			return;
		}
		customerDao.save(customer);
	}
}
