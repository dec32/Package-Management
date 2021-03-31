package com.demo.packageManagement.track;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TrackId.class)
public class Track {
	@Id
	@Column(name = "package_id")
	private String packageId;
	@Id
	@Column(name = "send_time")
	private Date sendTime;
	
	@Column(name = "vehicle_id")
	private String vehicleId;
	@Column(name = "warehouse_id")
	private String warehouseId;
	@Column(name = "arrive_time")
	private Date arriveTime;
	
	
	//getter & setters
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	
	
	
	
}
