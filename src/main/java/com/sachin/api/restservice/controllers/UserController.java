package com.sachin.api.restservice.controllers;

import java.util.List;

import org.antlr.v4.runtime.atn.ParseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.api.restservice.services.IUserService;
import com.sachin.api.restservices.entities.User;

@RestController
public class UserController {
	
	@Autowired
	private IUserService iuserService ;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		
		return this.iuserService.getAllUser();
	}
	

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id)
	{
		
		return this.iuserService.getUser(Integer.parseInt(id));
	}

	
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		
		return this.iuserService.addUser(user);
	}
}
