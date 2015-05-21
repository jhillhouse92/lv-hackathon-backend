package com.lv.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.HttpResponseMessage;
import com.lv.hackathon.domain.HttpResponseMessage.HttpStatus;
import com.lv.hackathon.domain.Post;
import com.lv.hackathon.service.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value ="posts", method = RequestMethod.GET)
	public List<Post> getAllPosts(){
		return postService.getAllPosts();
	}
	
	@RequestMapping(value = "posts", method = RequestMethod.PUT)
	@ResponseBody
	public HttpResponseMessage insertPost(@RequestBody Post post){
		if(postService.save(post)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
}
