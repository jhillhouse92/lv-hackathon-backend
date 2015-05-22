package com.lv.hackathon.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.lv.hackathon.domain.User;

@Repository("users")
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public <S extends User> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S insert(S entity) {
		// TODO Auto-generated method stub
		long count = mongoTemplate.count(new Query(), User.class);
		mongoTemplate.insert(entity);
		long countAfterInsert = mongoTemplate.count(new Query(), User.class);
		
		//if insert was successful return the record
		if(countAfterInsert > count){
			return entity;
		} else{
			return null;
		}
	}

	@Override
	public <S extends User> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		mongoTemplate.save(entity);
		
		return entity;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query().addCriteria(Criteria.where("dfn").is(id)), User.class);
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll(Iterable<String> ids) {
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
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<String> getUserFavorites(String dfn) {
		// TODO Auto-generated method stub
		User user = this.findOne(dfn);
		return user.getFavorites();
	}

	@Override
	public Boolean saveFavorite(String dfn, String id) {
		// TODO Auto-generated method stub
		try{
			mongoTemplate.updateFirst(new Query().addCriteria(Criteria.where("dfn").is(dfn)), 
					new Update().push("favorites", id), User.class);
			return true;
		} catch(Exception ex){
			return false;
		}
	}

	@Override
	public Boolean deleteFavorite(String dfn, String id) {
		// TODO Auto-generated method stub
		try{
			mongoTemplate.updateFirst(new Query().addCriteria(Criteria.where("dfn").is(dfn)), 
					new Update().pull("favorites", id), User.class);
			return true;
		} catch(Exception ex){
			return false;
		}
	}

}
