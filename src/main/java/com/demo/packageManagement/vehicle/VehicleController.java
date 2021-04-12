package com.demo.packageManagement.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController { //负责接收转发请求，不处理事务
		@Autowired
		private VehicleService vehicleService;
		//查询
		@RequestMapping("/api/vehicles")
		public List<Vehicle> findAll() {
			return vehicleService.findAll();
		}
		@RequestMapping("/api/vehicles/{id}")
		public Vehicle findOne(@PathVariable("id") String id) {
			return vehicleService.findOne(id);
		}
		
		//增加
		@RequestMapping(method = RequestMethod.POST, value = "/api/vehicles")
		public void add(@RequestBody Vehicle vehicle) {
			vehicleService.add(vehicle);
		}
		
		
		//删除
		@RequestMapping(method = RequestMethod.DELETE, value = "/api/vehicles/{id}") //注解与反射
		public void delete(@PathVariable("id") String id) {
			vehicleService.delete(id);
		}
		
		//修改
		@RequestMapping(method = RequestMethod.POST, value = "/api/vehicles/{id}")
		public void update(@PathVariable String id, @RequestBody Vehicle vehicle) {
			vehicleService.update(id, vehicle);
		}
		
}
