package com.solid.i_isp.persistance;

import java.util.List;

import com.solid.i_isp.entity.User;

public class UserRepo implements Repository<User>  {

	@Override
	public void save(User entity) {
		System.out.println("save method for user");
	}

	@Override
	public void delete(User entity) {
		System.out.println("delete method for user");
	}

	@Override
	public User findById(Long id) {
		System.out.println("findById method for user");
		return null;
	}

	@Override
	public List<User> findByName(String name) {
		System.out.println("findByName method for user");
		return null;
	}

}
