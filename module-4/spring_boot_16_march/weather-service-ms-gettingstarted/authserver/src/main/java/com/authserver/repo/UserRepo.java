package com.authserver.repo;

import com.authserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	public UserEntity findByUsername(String username);
}
