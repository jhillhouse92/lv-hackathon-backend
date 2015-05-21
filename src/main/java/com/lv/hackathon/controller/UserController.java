package com.lv.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.HttpResponseMessage;
import com.lv.hackathon.domain.HttpResponseMessage.HttpStatus;
import com.lv.hackathon.domain.User;
import com.lv.hackathon.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="user", method = RequestMethod.PUT)
	public HttpResponseMessage createUser(@RequestBody User user){
		if(userService.insertUser(user)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
	
	@RequestMapping(value ="user/{dfn}", method = RequestMethod.GET)
	public User getUser(@PathVariable String dfn){
		return userService.getUser(dfn);
	}
	
	@RequestMapping(value ="user/{dfn}", method = RequestMethod.PATCH)
	public User updateUser(@RequestBody User user){
		return userService.saveUser(user);
	}
}
