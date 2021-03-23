package com.demo.packageManagement.customer;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CustomerDao extends CrudRepository<Customer, String> {

}
