package com.startx.repository;

import org.springframework.data.repository.CrudRepository;

import com.startx.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
