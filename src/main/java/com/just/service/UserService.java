package com.just.service;

import java.util.List;

import com.just.entity.User;

public interface UserService {
	public List<User> findUsers();
	public int addUser(User user);
	public int updateUser(User user) ;
}
