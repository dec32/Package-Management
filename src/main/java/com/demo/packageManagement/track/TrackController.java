package com.demo.packageManagement.track;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.packageManagement.customer.Customer;

@RestController
public class TrackController {
	@Autowired
	private TrackService trackService;
	
	@RequestMapping("/api/tracks")
	public List<Track> findAll(
		@RequestParam(value = "package", required = false) String packageId,
		@RequestParam(value = "vehicle", required = false) String vehicleId,
		@RequestParam(value = "warehouse", required = false) String warehouseId) {
		return trackService.findAll(packageId, vehicleId, warehouseId);
	}
	
	@RequestMapping("/api/tracks/{package_id}/{send_time}")
	public void delete(
			@PathVariable("package_id") String packageId, 
			@PathVariable("send_time")String sendTime) {
//		TrackId trackId = new TrackId(packageId, new simp);
	}
	
}
