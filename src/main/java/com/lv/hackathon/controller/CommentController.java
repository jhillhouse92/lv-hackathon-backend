package com.lv.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lv.hackathon.domain.Comment;
import com.lv.hackathon.service.CommentService;

@RestController
@RequestMapping(value = "/post")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/{postId}/comments")
	public List<Comment> getCommentsForPost(@PathVariable String postId){
		return commentService.getComments(postId);
	}
}
