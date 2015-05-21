package com.lv.hackathon.config;  

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration 
@EnableMongoRepositories(basePackages = "com.lv.hackathon.repository")
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration   
public class AppConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "ptsd";
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient();
	}  
	
	@Override
	protected String getMappingBasePackage() {
		return "com.lv.hackathon.domain";
	}
} 