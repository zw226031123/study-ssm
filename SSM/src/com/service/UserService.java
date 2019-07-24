package com.service;

import java.util.List;

import com.pojo.User;

public interface UserService {
	void insUser(User user);
	List<User> selectUserAll();
}
