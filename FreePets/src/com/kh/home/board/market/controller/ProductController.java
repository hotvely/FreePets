package com.kh.home.board.market.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.market.model.*;
import com.kh.user.controller.UserController;

public class ProductController {
	
	List<Product> productList = new ArrayList<>();
	
	UserController uc = new UserController();
	
	// 펫 용품 판매 사이트 서버에서 상품을 연동해 객체에 저장
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
	public boolean addReview(int index, Review review) {
		
		if(uc.GetLogin()) {
			productList.get(index).getReview().add(review);
			return true;
		}		
		// 로그인 안 되어 있을 때
		return false;
	}
	
	// R : 리뷰 1개 보기
	public Review viewReview(int index1, int index2) {
		return productList.get(index1).getReview().get(index2);
	}
	
	// 리뷰 수 집계
	public void reviewCount(int index) {
		productList.get(index).setReviewCount(productList.get(index).getReview().size());
	}
	
	// U : 리뷰 수정 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void updateReview(int index1, int index2, Review review) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 수정 권한
		
		if(uc.logIn(null, null).getId().equals(review.getId())) {			
			productList.get(index1).getReview().set(index2, review);
		}		
	}
	
	// D : 리뷰 삭제 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void deleteReview(int index1, int index2) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 삭제 권한
		
		productList.get(index1).getReview().remove(index2);
	}	
	
	// 펫 용품을 추천
	public void recomProduct(int index) {
		productList.get(index).setRecommend(productList.get(index).getRecommend() + 1);
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
