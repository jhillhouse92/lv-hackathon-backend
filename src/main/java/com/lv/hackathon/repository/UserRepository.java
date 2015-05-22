package com.lv.hackathon.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lv.hackathon.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
	public List<String> getUserFavorites(String dfn);
	public Boolean saveFavorite(String dfn, String id);
	public Boolean deleteFavorite(String dfn, String id);
}
