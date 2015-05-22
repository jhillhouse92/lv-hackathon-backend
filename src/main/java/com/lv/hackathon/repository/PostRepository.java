package com.lv.hackathon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lv.hackathon.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	
}
