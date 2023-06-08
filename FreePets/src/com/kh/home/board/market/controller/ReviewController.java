package com.kh.home.board.market.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.market.model.Review;

public class ReviewController {
	
	List<Review> reviews = new ArrayList<>();
	private int reviewCount;  // 리뷰 수
	
	// C : 리뷰 작성 --> 로그인되어 있어야 함
	public boolean addReview(Review review) {
		// 로그인 기능
		// 로그인 되어 있을 때
		reviews.add(review);
		return true;
		// 로그인 안 되어 있을 때
//		return false;
		
	}
	
	// R : 리뷰 1개 보기
	public Review viewReview(int index) {
		return reviews.get(index);
	}
	
	// 리뷰 수 집계
	public int reviewCount() {
		reviewCount = reviews.size();
		return reviewCount;
	}
	
	// U : 리뷰 수정 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void updateReview(int index, Review review) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 수정 권한
		reviews.set(index, review);
	}
	
	// D : 리뷰 삭제 --> 리뷰 작성자와 로그인한 회원이 일치해야 권한
	public void deleteReview(int index) {
		// 로그인한 회원과 이 리뷰를 작성한 작성자가 일치할 때만 삭제 권한
		reviews.remove(index);
	}

}
