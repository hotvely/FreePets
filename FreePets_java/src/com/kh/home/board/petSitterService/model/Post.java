package com.kh.home.board.petSitterService.model;

import java.util.Date;

import com.kh.user.model.User;

public class Post {
//(펫시터를 구하는 사람과 펫시터를 하는 사람 글 올리는 클래스 )
	private User user; 
	private String content; //내용
	private String writer; //작성자
	private String title; //제목
	private String imgUrl; //이미지
	private String fileUrl; //파일
	private int pcount; //조회수
	private Date date; //작성 날짜 
	
	
	public Post() {
		
	}


	public Post(User user, String content, String writer, String title, String imgUrl, String fileUrl,
			int pcount, Date date) {
		super();
		this.user = user;
		this.content = content;
		this.writer = writer;
		this.title = title;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.pcount = pcount;
		this.date = date;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getFileUrl() {
		return fileUrl;
	}


	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}


	public int getPcount() {
		return pcount;
	}


	public void setPcount(int pcount) {
		this.pcount = pcount;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Post [user=" + user  + ", content=" + content + ", writer=" + writer + ", title=" + title
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + ", pcount=" + pcount + ", date=" + date + "]";
	}
	
	
	
	
	
	
	
}
