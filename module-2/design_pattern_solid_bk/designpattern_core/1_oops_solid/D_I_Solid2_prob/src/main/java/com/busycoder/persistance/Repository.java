package com.busycoder.persistance;

import java.util.List;

import com.busycoder.entity.Entity;
import com.busycoder.entity.User;

//common interface to be implemented by all persistence services. 
public interface Repository<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name) ;
	
}
