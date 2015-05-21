package com.lv.hackathon.service;

import com.lv.hackathon.domain.User;

public interface UserService {

	public User getUser(String dfn);
	public User saveUser(User user);
	public Boolean insertUser(User user);
}
