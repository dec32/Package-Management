package com.demo.packageManagement.bill;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	private String customerId;

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
