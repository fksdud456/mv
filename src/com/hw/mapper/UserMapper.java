package com.hw.mapper;

import java.util.List;

import com.hw.vo.User;

public interface UserMapper {
	public void insert(User obj);
	public void delete(String obj);
	public void update(User obj);
	public User select(String obj);
	public List<User> selectall();
}
