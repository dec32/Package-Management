package com.demo.packageManagement.vehicle;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

//数据持久层  z
@Transactional
public interface VehicleDao extends CrudRepository<Vehicle, String> { 

}