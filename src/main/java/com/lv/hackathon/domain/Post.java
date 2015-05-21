package com.lv.hackathon.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {

	@Id private String id;
	private String title;
	private Date date;
	private String message;
	private Type postType;
	private String author;
	private Integer mood;
	private boolean isPublic;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Type getPostType() {
		return postType;
	}


	public void setPostType(Type postType) {
		this.postType = postType;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Integer getMood() {
		return mood;
	}


	public void setMood(Integer mood) {
		this.mood = mood;
	}


	public boolean isPublic() {
		return isPublic;
	}


	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}


	public enum Type {
		askDoctor
	}
}
