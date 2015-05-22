package com.lv.hackathon.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lv.hackathon.domain.Comment;

public interface CommentRepository extends MongoRepository<Comment, String>  {
	public List<Comment> getAllCommentsForPost(String postId);
}
