package com.kh.home.board.market.model;

import java.time.LocalDate;

public class Review {
	
	private String id;  // 아이디
	private String reviewTitle;  // 리뷰 제목
	private String reviewContent;  // 리뷰 내용
	private String reviewImgUrl;  // 리뷰 사진
	// 시간도 추가하면 좋을 듯 합니당
	private LocalDate localDate;
	
	public Review() {}
	
	public Review(String id, String reviewTitle, String reviewContent, String reviewImgUrl) {
		super();
		this.id = id;
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
		this.reviewImgUrl = reviewImgUrl;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getReviewTitle() {
		return reviewTitle;
	}


	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}


	public String getReviewContent() {
		return reviewContent;
	}


	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}


	public String getReviewImgUrl() {
		return reviewImgUrl;
	}


	public void setReviewImgUrl(String reviewImgUrl) {
		this.reviewImgUrl = reviewImgUrl;
	}
	
}
