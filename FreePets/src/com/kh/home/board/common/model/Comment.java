package com.kh.home.board.common.model;

public class Comment {
	
	private String writer;
	private String describe;
	public int likes;
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(String writer, String describe) {
		this.writer = writer;
		this.describe = describe;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "Comment [writer=" + writer + ", describe=" + describe + ", likes=" + likes + "]";
	}

}
