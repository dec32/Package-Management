package com.demo.packageManagement.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
	@Autowired
	private BillDao billDao;
	public Iterable<Bill> findAll(String customerId){
		if(customerId != null) {
			return billDao.findByCustomerId(customerId);
		}
		return billDao.findAll();
	}
}
