package com.kh.home.board.market.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.kh.user.model.User;

public class Product {
	
	private String name;  // 제목
	private String imgUrl;  // 사진
	private int price;   // 가격
	private String site;  // 가져온 사이트
	private int recommend;  // 추천
	private List<Review> review = new ArrayList<>();
	private int reviewCount; // 리뷰 수
	
	// 나중에 먹이, 장난감 등 용품 쓰임새에 따른 카테고리 천천히 추가...
	
	public Product() {}

	public Product(String name, String imgUrl, int price, String site, int recommend, List<Review> review,
			int reviewCount) {
		super();
		this.name = name;
		this.imgUrl = imgUrl;
		this.price = price;
		this.site = site;
		this.recommend = recommend;
		this.review = review;
		this.reviewCount = reviewCount;
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

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(imgUrl, name, price, recommend, review, reviewCount, site);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(imgUrl, other.imgUrl) && Objects.equals(name, other.name) && price == other.price
				&& recommend == other.recommend && Objects.equals(review, other.review)
				&& reviewCount == other.reviewCount && Objects.equals(site, other.site);
	}

}
