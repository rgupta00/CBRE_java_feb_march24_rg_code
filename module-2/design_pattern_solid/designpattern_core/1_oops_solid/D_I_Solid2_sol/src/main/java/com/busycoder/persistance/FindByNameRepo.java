package com.busycoder.persistance;

import java.util.List;

import com.busycoder.entity.Entity;

public interface FindByNameRepo <T extends Entity>{
	public List<T> findByName(String name) ;
}
