package com.lv.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lv.hackathon.domain.Comment;
import com.lv.hackathon.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public List<Comment> getComments(String postId) {
		// TODO Auto-generated method stub
		return commentRepository.getAllCommentsForPost(postId);
	}

	@Override
	public Boolean save(Comment comment) {
		// TODO Auto-generated method stub
		return (null != commentRepository.insert(comment));
	}

}
