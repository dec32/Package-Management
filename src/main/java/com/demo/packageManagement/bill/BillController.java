package com.demo.packageManagement.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
	@Autowired
	private BillService billService;
	@RequestMapping("/api/bills")
	public Iterable<Bill> findAll(@RequestParam(value = "customer", required = false) String customerId){
		return billService.findAll(customerId);
	}
}
