package com.demo.packageManagement.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "vehicle")
public class  Vehicle { //view层
	@Id
	@Column(name = "vehicle_id")      private String vehicleId;
	@Column(name = "vehicle_type")    private String vehicleType;
	@Column(name = "driver_phone")    private String phoneNumber;
	
	public Vehicle() {
		super();
	}
	//getters & setters

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}