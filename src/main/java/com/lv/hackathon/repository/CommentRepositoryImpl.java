package com.lv.hackathon.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.lv.hackathon.domain.Comment;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public <S extends Comment> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Comment> S insert(S entity) {
		// TODO Auto-generated method stub
		long count = mongoTemplate.count(new Query(), Comment.class);
		mongoTemplate.insert(entity);
		long countAfterInsert = mongoTemplate.count(new Query(), Comment.class);
		
		//if insert was successful return the record
		if(countAfterInsert > count){
			return entity;
		} else{
			return null;
		}
	}

	@Override
	public <S extends Comment> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Comment> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Comment> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Comment> findAll(Iterable<String> ids) {
		//
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Comment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Comment> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> getAllCommentsForPost(String postId){
		return mongoTemplate.find(new Query().addCriteria(Criteria.where("post").is(postId)), Comment.class);
	}

}
