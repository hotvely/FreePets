package com.kh.home.board.common.model;

import java.util.HashMap;

public class Common {
	
	private String boardTitle;
	private String boardDetail;
	private String writer;
	private HashMap<Integer, String> comment = new HashMap<>();
	private HashMap<Integer, String> imgUrl = new HashMap<>();
	
	public Common() {
	}

	public Common(String boardTitle, String boardDetail, String writer, HashMap<Integer, String> comment,
			HashMap<Integer, String> imgUrl) {
		super();
		this.boardTitle = boardTitle;
		this.boardDetail = boardDetail;
		this.writer = writer;
		this.comment = comment;
		this.imgUrl = imgUrl;
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

	public HashMap<Integer, String> getComment() {
		return comment;
	}

	public void setComment(HashMap<Integer, String> comment) {
		this.comment = comment;
	}

	public HashMap<Integer, String> getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(HashMap<Integer, String> imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Common [boardTitle=" + boardTitle + ", boardDetail=" + boardDetail + ", writer=" + writer + ", comment="
				+ comment + ", imgUrl=" + imgUrl + "]";
	}
	
	
 
}
