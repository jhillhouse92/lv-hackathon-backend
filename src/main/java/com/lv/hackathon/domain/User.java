package com.lv.hackathon.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id private String id;
	private String handle;
	private String dfn;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setHandle(String handle){
		this.handle = handle;
	}
	
	public String getHandle(){
		return this.handle;
	}
	
	public void setDfn(String dfn){
		this.dfn = dfn;
	}
	
	public String getDfn(){
		return this.dfn;
	}
}
