package com.kh.home.board.market.model;

import java.util.Objects;

import com.kh.user.model.User;

public class Product {
	
	private String name;  // 제목
	private String imgUrl;  // 사진
	private int price;   // 가격
	private String site;  // 가져온 사이트
	private int recommend;  // 추천
	
	// 나중에 먹이, 장난감 등 용품 쓰임새에 따른 카테고리 천천히 추가...
	
	
	public Product() {}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	
	

}
