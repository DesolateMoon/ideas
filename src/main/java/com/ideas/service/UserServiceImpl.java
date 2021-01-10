package com.ideas.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas.dao.UserDAO;
import com.ideas.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO uD;
	
	@Override
	public boolean verifyPassword(String password, String passwordConf) {
		return password.equals(passwordConf);
	}
	
	@Override
	public void addUser(User user) {
		uD.addUser(user);		
	}
	
	@Override
	public User verifyUser(String email, String password) {
		return uD.verifyUser(email, password);
	}
}
