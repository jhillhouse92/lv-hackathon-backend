package com.lv.hackathon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

	@RequestMapping(value ="test", method = RequestMethod.GET)
	@ResponseBody
	public String getAllPosts(){
		return "First REST Service";
	}
}
