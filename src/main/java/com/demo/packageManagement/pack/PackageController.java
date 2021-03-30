package com.demo.packageManagement.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
	@Autowired
	private PackageServive packageServive;
	@RequestMapping("/api/packages")
	public List<Package> getAll() {
		return packageServive.findAll();
	}
}
