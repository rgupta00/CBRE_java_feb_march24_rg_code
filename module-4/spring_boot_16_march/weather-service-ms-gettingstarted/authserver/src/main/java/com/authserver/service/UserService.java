package com.authserver.service;

import com.authserver.entity.UserEntity;

public interface UserService {
	public UserEntity findByUsername(String username);
	public void addUser(UserEntity userEntity);
}
