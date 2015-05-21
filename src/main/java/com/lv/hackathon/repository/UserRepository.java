package com.lv.hackathon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lv.hackathon.domain.User;


public interface UserRepository extends MongoRepository<User, String> {

}
