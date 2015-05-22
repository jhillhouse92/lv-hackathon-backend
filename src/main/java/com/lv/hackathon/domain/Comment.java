package com.lv.hackathon.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {
	
	
	
	@Id private String id;
	private String comment;
	private String author;
	private AuthorType authorType;
	private Date date;
	private String postId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public AuthorType getAuthorType() {
		return authorType;
	}
	public void setAuthorType(AuthorType authorType) {
		this.authorType = authorType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	
	public enum AuthorType {
		PROVIDER,
		VETERAN
	}
}
