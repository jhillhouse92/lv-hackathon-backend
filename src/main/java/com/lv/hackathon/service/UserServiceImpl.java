package com.lv.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lv.hackathon.domain.Post;
import com.lv.hackathon.domain.User;
import com.lv.hackathon.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostService postService;
	
	@Override
	public User getUser(String dfn) {
		// TODO Auto-generated method stub
		return userRepository.findOne(dfn);
	}
	
	@Override
	public User saveUser(User user){
		return userRepository.save(user);
	}
	
	@Override
	public Boolean insertUser(User user){
		return (null == userRepository.insert(user));
	}
	
	@Override
	public List<Post> getUserFavorites(String dfn){
		List<String> postIds = userRepository.getUserFavorites(dfn); 
		return postService.getAllPosts(postIds);
	}
	
	@Override
	public Boolean saveFavorite(String dfn, String postId){
		return userRepository.saveFavorite(dfn, postId);
	}

	@Override
	public Boolean deleteFavorite(String dfn, String id) {
		// TODO Auto-generated method stub
		return userRepository.deleteFavorite(dfn, id);
	}
	
	

}
