package com.lv.hackathon.service;

import java.util.List;

import com.lv.hackathon.domain.Comment;

public interface CommentService {

	public List<Comment> getComments(String postId);
}
