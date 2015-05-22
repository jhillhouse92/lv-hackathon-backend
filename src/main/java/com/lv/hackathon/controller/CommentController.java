package com.lv.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.Comment;
import com.lv.hackathon.domain.HttpResponseMessage;
import com.lv.hackathon.domain.HttpResponseMessage.HttpStatus;
import com.lv.hackathon.service.CommentService;

@RestController
@RequestMapping(value = "/post")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/{postId}/comments", method = RequestMethod.GET)
	public List<Comment> getCommentsForPost(@PathVariable String postId){
		return commentService.getComments(postId);
	}
	
	@RequestMapping(value = "/{postId}/comment", method = RequestMethod.PUT)
	@ResponseBody
	public HttpResponseMessage addComment(@RequestBody Comment comment){
		if(commentService.save(comment)){
			return new HttpResponseMessage(HttpStatus.SUCCESSFUL);
		} else{
			return new HttpResponseMessage(HttpStatus.SERVER_ERROR);
		}
	}
	
}
