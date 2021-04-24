package com.demo.packageManagement.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("/api/orders")
	public Iterable<Order> findAll(@RequestParam(name = "customer",required = false)String customerId){
		return orderService.findAll(customerId);
	}
//	@RequestMapping("/api/orders")
//	public Iterable<Order> findAll(){
//		return orderService.findAll();
//	}

	
	@RequestMapping("/api/orders/{packageId}")
	public Order findOne(@PathVariable("packageId") String packageId) {
		return orderService.findOne(packageId);
	}
	
	@RequestMapping(value = "/api/orders", method = RequestMethod.POST)
	public void add(@RequestBody Order order) {
		orderService.add(order);
	}
	
	@RequestMapping(value = "/api/orders/{packageid}", method = RequestMethod.POST)
	public void update(@PathVariable("packageId") String packageId, @RequestBody Order order) {
		orderService.update(packageId, order);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/orders/{packageId}")
	public void delete(@PathVariable("packageId") String packageId) {
		orderService.delete(packageId);
	}
}
