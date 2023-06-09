package com.kh.home.board.market.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.market.model.*;

public class ProductController {
	
	List<Product> productList = new ArrayList<>();
	List<Product> reviewList = new ArrayList<>();
	private int reviewCount; // 리뷰 수
	
	// 펫 용품 판매 사이트에서 상품을 연동해 객체에 저장
	// 하는 법은 몰라서 일단 비워 두었어요...
	
	// 저장된 상품을 펫 용품 리스트에 추가
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	// 펫 용품 1개 보기
	public Product viewProductInfo(int index) {
		return productList.get(index);
	}
	
	// 리뷰 작성 --> 로그인되어 있어야 함
	public boolean addReview(int index, Review reiview) {
		// 로그인 기능
		// 로그인 되어 있을 때
		productList.get(index);
//		reviewList.add(reiview);
		return true;
		// 로그인 안 되어 있을 때
//		return false;
	}
	
	// R : 리뷰 1개 보기
	public Product viewReview(int index) {
		return reviewList.get(index);
	}
	
	// 리뷰 수 집계
	public int reviewCount() {
		reviewCount = reviewList.size();
		return reviewCount;
	}
	
	// U : 리뷰 수정 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void updateReview(int index, Product product) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 수정 권한
		reviewList.set(index, product);
	}
	
	// D : 리뷰 삭제 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void deleteReview(int index) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 삭제 권한
		reviewList.remove(index);
	}	
	
	// 펫 용품을 추천
	public void recomProduct(int index) {
//		productList.get(index).setRecommend(productList.get(index).getRecommend() + 1);
	}
	
	// 펫 용품 정보 수정 하기
	public void updateProduct(int index, Product product) {
		productList.set(index, product);
	}
	
	// 펫 용품 삭제
	public void deleteProduct(int index) {
		productList.remove(index);
	}
	
}
