package com.demo.packageManagement.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public List<Customer> getAll(){
		List customerList = new ArrayList<Customer>();
		customerDao.findAll().forEach(customerList::add);
		return customerList;
	}
}
