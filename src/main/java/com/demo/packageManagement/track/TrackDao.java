package com.demo.packageManagement.track;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TrackDao extends CrudRepository<Track, TrackId>{
	//Spring Data Jpa 会根据方法名自动实现方法体
	public List<Track> findByPackageId(String packageId);

	public List<Track> findByVehicleId(String vehicleId);

	public List<Track> findByWarehouseId(String warehouseId);
	
}
