package com.demo.packageManagement.pack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
	@RequestMapping("/packages")
	public String getAll() {
		return "All Packages";
	}
}
