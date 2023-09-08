package com.kh.home.board.common.model;

import java.sql.Date;
import java.util.ArrayList;

public class Common {
	
	
	private String boardTitle;
	private String boardDetail;
	private String writer;
	private Date date;
	private int likes;
	private ArrayList<Comment> comments = new ArrayList<>();
	private ArrayList<Report> reports = new ArrayList<>();
	public Common() {
		// TODO Auto-generated constructor stub
	}
	public Common(String boardTitle, String boardDetail, String writer) {
		super();
		this.boardTitle = boardTitle;
		this.boardDetail = boardDetail;
		this.writer = writer;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardDetail() {
		return boardDetail;
	}
	public void setBoardDetail(String boardDetail) {
		this.boardDetail = boardDetail;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	public ArrayList<Report> getReports() {
		return reports;
	}
	public void setReports(ArrayList<Report> reports) {
		this.reports = reports;
	}
	@Override
	public String toString() {
		return "Common [boardTitle=" + boardTitle + ", boardDetail=" + boardDetail + ", writer=" + writer + ", date="
				+ date + ", likes=" + likes + ", comments=" + comments + "]";
	}
	
	
}