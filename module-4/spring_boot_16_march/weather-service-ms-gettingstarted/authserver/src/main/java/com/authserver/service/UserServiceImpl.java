package com.authserver.service;

import com.authserver.entity.UserEntity;
import com.authserver.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserEntity findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public void addUser(UserEntity userEntity) {
		userRepo.save(userEntity);
	}

}







