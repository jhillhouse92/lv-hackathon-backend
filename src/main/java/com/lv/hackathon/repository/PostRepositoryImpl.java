package com.lv.hackathon.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;

import com.lv.hackathon.domain.Post;

public class PostRepositoryImpl implements PostRepository {

	private final MongoOperations operations;
	
	@Autowired
	public PostRepositoryImpl(MongoOperations operations) {
		// TODO Auto-generated constructor stub
		this.operations = operations;
	}
	
	@Override
	public <S extends Post> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return operations.findAll(Post.class);
	}

	@Override
	public List<Post> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Post> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Post> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
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
