package com.lv.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lv.hackathon.domain.Post;
import com.lv.hackathon.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		System.out.println("Service Method Called");
		return postRepository.findAll();
	}

}
