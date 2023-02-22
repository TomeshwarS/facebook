package com.facebook.facebook.dao;

import org.springframework.data.repository.CrudRepository;

import com.facebook.facebook.model.AppUsers;

public interface RegistrationAndLoginRepo extends CrudRepository<AppUsers, Integer> {

	
	AppUsers findByEmail(String email);
}
