package com.demo.packageManagement.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PackageController {
	@Autowired
	private PackageServive packageServive;

	
	@RequestMapping("/api/packages")
	public Iterable<Package> findAll(@RequestParam(value = "package", required=false) String packageId) {
		return packageServive.findAll(packageId);
	}
	
	@RequestMapping("/api/packages/{id}")
	public Package findOne(@PathVariable("id") String id) {
		return packageServive.findOne(id);
	}
	
	// 增加
	@RequestMapping(method = RequestMethod.POST, value = "/api/packages")
	public void add(@RequestBody Package pack) {
		packageServive.add(pack);
		System.out.println("增加包裹");
	}

	// 删除
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/packages/{id}")
	public void delete(@PathVariable("id") String id) {
		packageServive.delete(id);
	}

	// 修改
	@RequestMapping(method = RequestMethod.POST, value = "/api/packages/{id}")
	public void update(@PathVariable String id, @RequestBody Package pack) {
		packageServive.update(id, pack);
	}
}
