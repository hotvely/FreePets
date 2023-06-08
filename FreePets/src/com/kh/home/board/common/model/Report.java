package com.kh.home.board.common.model;

public class Report {
	
	private String writer;
	private String title;
	private String describe;
	public Report() {
		// TODO Auto-generated constructor stub
	}
	public Report(String writer, String title, String describe) {
		this.writer = writer;
		this.title = title;
		this.describe = describe;
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
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "Report [writer=" + writer + ", title=" + title + ", describe=" + describe + "]";
	}
	
	

}
