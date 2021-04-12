package com.demo.packageManagement.warehouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WarehouseService {
	@Autowired
	private WarehouseDao warehouseDao;
	public List<Warehouse> findAll(){
		List vehicleList = new ArrayList<Warehouse>();
		warehouseDao.findAll().forEach(vehicleList::add);
		return vehicleList;
	}
	
	public Warehouse findOne(String id) {
		return warehouseDao.findOne(id);
	}
	
	public void delete(String id) {
		warehouseDao.delete(id);
	}
	
	public void add(Warehouse warehouse) {
		warehouseDao.save(warehouse);
	}
	
	public void update(String id, Warehouse warehouse) {
		//当传入的新对象的 id 与原有对象的 id 不一致时，应当拒绝修改
		if(!id.equals(warehouse.getWarehouseId())) {
			return;
		}
		warehouseDao.save(warehouse);
	}
}
