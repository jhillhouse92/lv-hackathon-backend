package com.lv.hackathon.service;

import java.util.List;

import com.lv.hackathon.domain.Post;

public interface PostService {

	public List<Post> getAllPosts();

	public Boolean save(Post p);

	public List<Post> getAllPosts(List<String> ids);

}
