package com.demo.packageManagement.warehouse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Warehouse {
	@Id
	@Column(name = "warehouse_id")         private String warehouseId;
	@Column(name = "warehouse_name")       private String warehouseName;
	@Column(name = "warehouse_manage")     private String warehouseManage;
	@Column(name = "warehouse_phone")      private String phoneNumber;
	@Column(name = "warehouse_address")    private String warehouseAddress;
	public Warehouse() {
		super();
	}
	//getters & setters
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseManage() {
		return warehouseManage;
	}
	public void setWarehouseManager(String warehouseManage) {
		this.warehouseManage = warehouseManage;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWarehouseAddress() {
		return warehouseAddress;
	}
	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}
	public void setWarehouseManage(String warehouseManage) {
		this.warehouseManage = warehouseManage;
	}
	
	
	
	
}
