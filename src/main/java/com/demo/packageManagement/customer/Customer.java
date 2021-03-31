package com.demo.packageManagement.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private String customerId;
	@Column(name = "customer_name")
	private String name;
	@Column(name = "phone")
	private String phoneNumber;
	@Column(name = "is_contract")
	private boolean contracted;

	public Customer() {
		super();
	}
	//getters & setters
	
	public String getName() {
		return name;
	}
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isContracted() {
		return contracted;
	}

	public void setContracted(boolean contracted) {
		this.contracted = contracted;
	}
	
	
}
