package com.demo.packageManagement.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class Package {
	@Id
	private String id;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
