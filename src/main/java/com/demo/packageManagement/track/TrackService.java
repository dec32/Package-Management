package com.demo.packageManagement.track;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TrackService {
	@Autowired
	private TrackDao trackDao;
	
//	public List<Track> findAll(){
//		List trackList = new ArrayList<Track>();
//		trackDao.findAll().forEach(trackList::add);
//		return trackList;
//	}
	
	public List<Track> findAll(String packageId, String vehicleId, String warehouseId){
		if(packageId!=null) {
			return trackDao.findByPackageId(packageId);
		}
		if(vehicleId!=null) {
			return trackDao.findByVehicleId(vehicleId);
		}
		if(warehouseId!=null) {
			return trackDao.findByWarehouseId(warehouseId);
		}
		List trackList = new ArrayList<Track>();
		trackDao.findAll().forEach(trackList::add);
		return trackList;
		
		
	}
	
	public void delete(TrackId trackId) {
		trackDao.delete(trackId);
	}
	
	public void add(Track track) {
		trackDao.save(track);
	}
	
	public void update(Track track) {
		trackDao.save(track);
	}
}
