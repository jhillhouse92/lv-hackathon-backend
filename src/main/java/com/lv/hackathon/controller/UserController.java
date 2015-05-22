package com.lv.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.HttpResponseMessage;
import com.lv.hackathon.domain.HttpResponseMessage.HttpStatus;
import com.lv.hackathon.domain.Post;
import com.lv.hackathon.domain.User;
import com.lv.hackathon.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="/", method = RequestMethod.PUT)
	@ResponseBody
	public HttpResponseMessage createUser(@RequestBody User user){
		if(userService.insertUser(user)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
	
	@RequestMapping(value ="/{dfn}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable String dfn){
		return userService.getUser(dfn);
	}
	
	@RequestMapping(value ="/{dfn}", method = RequestMethod.PATCH)
	@ResponseBody
	public User updateUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@RequestMapping(value = "/{dfn}/favorites", method = RequestMethod.GET)
	@ResponseBody
	public List<Post> getFavoritedPosts(@PathVariable String dfn){
		return userService.getUserFavorites(dfn);
	}
	
	@RequestMapping(value = "/{dfn}/favorites/{postId}", method = RequestMethod.PUT)
	@ResponseBody
	public HttpResponseMessage saveFavorite(@PathVariable String dfn, @PathVariable String postId){
		if(userService.saveFavorite(dfn, postId)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/{dfn}/favorties/{postId}", method = RequestMethod.DELETE)
	public HttpResponseMessage deleteFavorite(@PathVariable String dfn, @PathVariable String postId){
		if(userService.deleteFavorite(dfn, postId)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
}
