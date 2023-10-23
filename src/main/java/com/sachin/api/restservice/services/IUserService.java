package com.sachin.api.restservice.services;

import java.util.List;

import com.sachin.api.restservices.entities.User;

public interface IUserService {
	

	public List<User> getAllUser();
	
	public User getUser(int userid);

	public User addUser(User user);

}
