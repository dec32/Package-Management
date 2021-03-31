package com.demo.packageManagement.track;

import java.io.Serializable;
import java.sql.Date;


public class TrackId implements Serializable{
	private String packageId;
	private Date sendTime;
	
	//constructors
	public TrackId() {
		
	}
	public TrackId(String packageId, Date sendTime) {
		this.packageId = packageId;
		this.sendTime = sendTime;
	}
	//getters & setters
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((packageId == null) ? 0 : packageId.hashCode());
		result = prime * result + ((sendTime == null) ? 0 : sendTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrackId other = (TrackId) obj;
		if (packageId == null) {
			if (other.packageId != null)
				return false;
		} else if (!packageId.equals(other.packageId))
			return false;
		if (sendTime == null) {
			if (other.sendTime != null)
				return false;
		} else if (!sendTime.equals(other.sendTime))
			return false;
		return true;
	}
	
	
	
	

	
}
