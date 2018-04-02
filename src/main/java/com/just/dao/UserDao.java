package com.just.dao;

import java.util.List;

import com.just.entity.User;

public interface UserDao {
	public List<User> findUser();
	public int addUser(User user);
	public int updateUser(User user) ;
}
