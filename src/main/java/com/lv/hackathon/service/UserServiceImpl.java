package com.lv.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lv.hackathon.domain.User;
import com.lv.hackathon.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(String dfn) {
		// TODO Auto-generated method stub
		return userRepository.findOne(dfn);
	}
	
	@Override
	public User saveUser(User user){
		return userRepository.save(user);
	}
	
	@Override
	public Boolean insertUser(User user){
		return (null == userRepository.insert(user));
	}

}
