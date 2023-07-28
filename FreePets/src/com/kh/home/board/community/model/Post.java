package com.kh.home.board.community.model;

import java.util.Date;

import com.kh.user.model.User;

public class Post {
    private int postId;
    private String title;
    private String content;
    private Date createdDate;
    private User user;
    private int view;
    private int like;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
    
}
