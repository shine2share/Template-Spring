package com.startx.repository;

import org.springframework.data.repository.CrudRepository;

import com.startx.model.User;
import com.startx.model.UserProfile;

public interface RoleRepository extends CrudRepository<User, Integer> {

	UserProfile findByName(String name);
	
}
