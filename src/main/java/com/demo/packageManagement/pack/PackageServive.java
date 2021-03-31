package com.demo.packageManagement.pack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.packageManagement.customer.Customer;

@Service
public class PackageServive {
	@Autowired
	private PackageDao packageDao;
	
	public List<Package> findAll(String customerId){
		//若顾客 id 非空，则需要筛选，若顾客 id 为空，直接返回全部数据即可
		if(customerId != null) {
			return packageDao.findByCustomerId(customerId);
		}
		List packageList = new ArrayList<Customer>();
		packageDao.findAll().forEach(packageList::add);
		return packageList;
	}
	
	public Package findOne(String id) {
		return packageDao.findOne(id);
	}
	
	public List<Package> findByCustomerId(String customerId){
		return packageDao.findByCustomerId(customerId);
	}
	
	public void delete(String id) {
		packageDao.delete(id);
	}
	
	public void add(Package pack) {
		packageDao.save(pack);
	}
	
	public void update(String id, Package pack) {
		//当传入的新对象的 id 与原有对象的 id 不一致时，应当拒绝修改
		if(!id.equals(pack.getId())) {
			return;
		}
		packageDao.save(pack);
	}
	
}
