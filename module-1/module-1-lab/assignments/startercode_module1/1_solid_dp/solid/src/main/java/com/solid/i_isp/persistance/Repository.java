package com.solid.i_isp.persistance;

import java.util.List;

import com.solid.i_isp.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface Repository<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name) ;
	
}
