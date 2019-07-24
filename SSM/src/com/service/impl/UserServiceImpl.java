package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public void insUser(User user) {
		userMapper.insUser(user);
	}

	@Override
	public List<User> selectUserAll() {
		return userMapper.selectUserAll();
	}

}
