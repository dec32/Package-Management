package com.demo.packageManagement.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/customers")
	public List<Customer> getAll() {
		return customerService.getAll();
	}
	

}
