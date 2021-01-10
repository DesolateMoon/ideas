package com.ideas.service;

import com.ideas.entity.User;

public interface UserService {
	public boolean verifyPassword(String password, String passwordConf);
	
	public void addUser(User user);
	
	public User verifyUser(String email, String password);
}
