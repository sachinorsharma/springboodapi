package com.sachin.api.restservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.api.restservices.entities.User;


@Service
public class UserService implements IUserService{
	
	
	List<User> list;
	
	public UserService()
	{
		list=new ArrayList<User>();
		list.add(new User(101, "user_101","sachin", "sharma", "sachin@gmail.com", "admin", "SSN01"));
		list.add(new User(102, "user_102","nitin", "sharma", "nitin@gmail.com", "admin", "SSN02"));
		list.add(new User(103, "user_103","vandana", "sharma", "vandana@gmail.com", "Sales", "SSN03"));
		list.add(new User(104, "user_104","Ankita", "sharma", "Ankita@gmail.com", "sales", "SSN04"));
	}
	

	public List<User> getAllUser()
	{
		
		return list;
	}


	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
	User u=null;
	for(   User user:list) {
		 if(user.getId()==id)
		 {
			 return user;
		 }
		 }
	
	return u;
	}


	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
	}

}
