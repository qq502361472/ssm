package com.manage.ssm.service;

import java.util.List;

import com.manage.ssm.entity.User;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
