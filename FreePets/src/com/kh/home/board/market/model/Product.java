package com.kh.home.board.market.model;

import com.kh.user.model.User;

public class Product {
	
	private String name;  // 제목
	private String imgUrl;  // 사진
	private int price;   // 가격
	private String site;  // 가져온 사이트
	private int recommend;  // 추천
	
	// 나중에 먹이, 장난감 등 용품 쓰임새에 따른 카테고리 천천히 추가...
	
	private Review review;
		

	public Product() {}

	public Product(String name, String imgUrl, int price, String site, int recommend, Review review) {
		super();
		this.name = name;
		this.imgUrl = imgUrl;
		this.price = price;
		this.site = site;
		this.recommend = recommend;
		this.review = review;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
}
