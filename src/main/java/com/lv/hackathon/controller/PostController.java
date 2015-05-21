package com.lv.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.Post;
import com.lv.hackathon.service.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public String test(){
		return "test";
	}

	@RequestMapping(value ="posts", method = RequestMethod.GET)
	public List<Post> getAllPosts(){
		System.out.println("Posts Method Called");
		return postService.getAllPosts();
	}
}
