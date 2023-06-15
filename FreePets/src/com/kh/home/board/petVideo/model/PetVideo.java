package com.kh.home.board.petVideo.model;

import java.util.Date;

public class PetVideo {
// 유튜브 연동,,,
	private String title;
	private Date uploadAt;
	private int views;
	private String fileUrl;
	private String content; // 비디오 내용쓰기(설명글?)
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
