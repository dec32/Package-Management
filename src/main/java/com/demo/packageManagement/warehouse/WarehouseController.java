package com.demo.packageManagement.warehouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController { //负责接收转发请求，不处理事务
		@Autowired
		private WarehouseService warehouseService;
		//查询
		@RequestMapping("/api/warehouses")
		public List<Warehouse> findAll() {
			return warehouseService.findAll();
		}
		@RequestMapping("/api/warehouses/{id}")
		public Warehouse findOne(@PathVariable("id") String id) {
			return warehouseService.findOne(id);
		}
		
		//增加
		@RequestMapping(method = RequestMethod.POST, value = "/api/warehouses")
		public void add(@RequestBody Warehouse warehouse) {
			warehouseService.add(warehouse);
		}
		
		
		//删除
		@RequestMapping(method = RequestMethod.DELETE, value = "/api/warehouses/{id}") //注解与反射
		public void delete(@PathVariable("id") String id) {
			warehouseService.delete(id);
		}
		
		//修改
		@RequestMapping(method = RequestMethod.POST, value = "/api/warehouses/{id}")
		public void update(@PathVariable String id, @RequestBody Warehouse warehouse) {
			warehouseService.update(id, warehouse);
		}
		
}
