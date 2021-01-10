package com.ideas.dao;

import com.ideas.entity.User;

public interface UserDAO {
	public void addUser(User user);
	
	public User verifyUser(String email, String password);
}
