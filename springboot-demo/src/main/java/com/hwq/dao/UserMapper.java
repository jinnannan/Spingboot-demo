package com.hwq.dao;

import java.util.List;

import com.hwq.entity.User;

public interface UserMapper {
    List<User> select();

	void insertInto(User user);
	
	void delete(User user);
}
