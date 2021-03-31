package com.demo.packageManagement.track;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
