package com.demo.packageManagement.pack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PackageDao extends CrudRepository<Package, String> {
	
	@Query(value = "select p from Package p where p.id in"
			     + "(select o.packageId from Order o where o.customerId = ?1)")
	public List<Package> findByCustomerId(String customerId);
}
