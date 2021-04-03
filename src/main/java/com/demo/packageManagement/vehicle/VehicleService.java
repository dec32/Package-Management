package com.demo.packageManagement.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {   //具体业务代码
	@Autowired
	private VehicleDao vehicleDao;
	public List<Vehicle> findAll(){
		List vehicleList = new ArrayList<Vehicle>();
		 vehicleDao.findAll().forEach(vehicleList::add);
		return vehicleList;
	}
	
	public Vehicle findOne(String id) {
		return vehicleDao.findOne(id);
	}
	
	public void delete(String id) {
		vehicleDao.delete(id);
	}
	
	public void add(Vehicle vehicle) {
		vehicleDao.save(vehicle);
	}
	
	public void update(String id, Vehicle vehicle) {
		//当传入的新对象的 id 与原有对象的 id 不一致时，应当拒绝修改
		if(!id.equals(vehicle.getVehicleId())) {
			return;
		}
		vehicleDao.save(vehicle);
	}
}
