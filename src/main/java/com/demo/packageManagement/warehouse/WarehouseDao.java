package com.demo.packageManagement.warehouse;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface WarehouseDao extends CrudRepository<Warehouse, String> {

}