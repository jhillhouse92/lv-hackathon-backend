package com.lv.hackathon.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	private String handle;
	private String dfn;
	
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
