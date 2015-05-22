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

import com.lv.hackathon.domain.Post;

@Repository
public class PostRepositoryImpl implements PostRepository {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public <S extends Post> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findAll() {
		return mongoTemplate.findAll(Post.class);
	}

	@Override
	public List<Post> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Post> S insert(S entity) {
		// TODO Auto-generated method stub
		long count = mongoTemplate.count(new Query(), Post.class);
		mongoTemplate.insert(entity);
		long countAfterInsert = mongoTemplate.count(new Query(), Post.class);
		
		//if insert was successful return the record
		if(countAfterInsert > count){
			return entity;
		} else{
			return null;
		}
	}

	@Override
	public <S extends Post> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Post> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Post> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findOne(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query().addCriteria(Criteria.where("_id").is(id)), Post.class);
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Post> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return mongoTemplate.find(new Query().addCriteria(Criteria.where("_id").in(ids)), Post.class);
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
	public void delete(Post entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Post> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
