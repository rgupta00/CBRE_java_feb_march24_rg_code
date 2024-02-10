package com.company.intersegrega.service;

import java.util.List;

import com.company.intersegrega.entity.Entity;

public class OrderPersistenceService implements PersistenceService {

	@Override
	public void save(Entity entity) {
		//ok
	}

	@Override
	public void delete(Entity entity) {
		//ok
	}

	@Override
	public Entity findById(Long id) {
		//ok
		return null;
	}

	@Override
	public List findByName(String name) {
		throw new UnsupportedOperationException();
	}

	

}
