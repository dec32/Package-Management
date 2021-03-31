package com.demo.packageManagement.bill;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface BillDao extends CrudRepository<Bill, String>{
	public Iterable<Bill> findByCustomerId(String customerId);
}
