package com.d_isp.intersegrega.service;

import com.d_isp.intersegrega.entity.Entity;

import java.util.List;


//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name) ;
	
}
