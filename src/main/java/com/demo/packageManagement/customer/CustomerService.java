package com.demo.packageManagement.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public List<Customer> findAll(){
		List customerList = new ArrayList<Customer>();
		customerDao.findAll().forEach(customerList::add);
		return customerList;
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
	
	public void update(String id, Customer customer) {
		//当传入的新对象的 id 与原有对象的 id 不一致时，应当拒绝修改
		if(!id.equals(customer.getId())) {
			return;
		}
		customerDao.save(customer);
	}
}
