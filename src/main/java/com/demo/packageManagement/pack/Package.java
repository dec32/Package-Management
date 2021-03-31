package com.demo.packageManagement.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class Package {
	@Id
	@Column(name = "package_id")       private String packageId;
	@Column(name = "shipper_name")     private String shipperName;
	@Column(name = "shipper_phone")    private String shipperPhoneNumber;
	@Column(name = "shipper_address")  private String shipperAddress;
	@Column(name = "receiver_name")    private String receiverName;
	@Column(name = "receiver_phone")   private String receiverPhoneNumber;
	@Column(name = "receiver_address") private String receiverAddress;
	private String size;
	private double weight;
	@Column(name = "serve")            private String service;
	private String remarks;
	
	
	//getters & setters
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getShipperPhoneNumber() {
		return shipperPhoneNumber;
	}
	public void setShipperPhoneNumber(String shipperPhoneNumber) {
		this.shipperPhoneNumber = shipperPhoneNumber;
	}
	public String getShipperAddress() {
		return shipperAddress;
	}
	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}
	
	

	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhoneNumber() {
		return receiverPhoneNumber;
	}
	public void setReceiverPhoneNumber(String receiverPhoneNumber) {
		this.receiverPhoneNumber = receiverPhoneNumber;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

	
	
	
}
