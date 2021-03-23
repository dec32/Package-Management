package com.demo.packageManagement.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	//查询
	@RequestMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	@RequestMapping("/customers/{id}")
	public Customer findOne(@PathVariable("id") String id) {
		return customerService.findOne(id);
	}
	
	//增加
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void add(@RequestBody Customer customer) {
		customerService.add(customer);
	}
	
	
	//删除
	@RequestMapping(method = RequestMethod.DELETE, value = "customers/{id}")
	public void delete(@PathVariable("id") String id) {
		customerService.delete(id);
	}
	
	//修改
	@RequestMapping(method = RequestMethod.POST, value = "customers/{id}")
	public void update(@PathVariable String id, @RequestBody Customer customer) {
		customerService.update(id, customer);
	}
	

}
