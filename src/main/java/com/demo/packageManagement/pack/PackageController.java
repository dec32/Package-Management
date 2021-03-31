package com.demo.packageManagement.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
	@Autowired
	private PackageServive packageServive;

	
	@RequestMapping("/api/packages")
	public List<Package> findAll(@RequestParam(value = "customer", required=false) String customerId) {
		return packageServive.findAll(customerId);
	}
	
	@RequestMapping("/api/packages/{id}")
	public Package findOne(@PathVariable("id") String id) {
		return packageServive.findOne(id);
	}
}
