package com.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.pojo.User;

@MapperScan
public interface UserMapper {
	void insUser(User user);
	List<User> selectUserAll();
}
