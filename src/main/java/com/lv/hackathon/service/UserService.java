package com.lv.hackathon.service;

import java.util.List;

import com.lv.hackathon.domain.Post;
import com.lv.hackathon.domain.User;

public interface UserService {

	public User getUser(String dfn);
	public User saveUser(User user);
	public Boolean insertUser(User user);
	public List<Post> getUserFavorites(String dfn);
	public Boolean saveFavorite(String dfn, String postId);
	public Boolean deleteFavorite(String dfn, String id);
}
