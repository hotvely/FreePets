package com.kh.home.board.market.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.home.board.market.compare.PriceOrder;
import com.kh.home.board.market.compare.RecommendOrder;
import com.kh.home.board.market.compare.ReviewOrder;
import com.kh.home.board.market.model.Product;
import com.kh.user.controller.CashInfoController;
import com.kh.user.controller.UserController;

public class MarketController {
		
	ProductController pc = new ProductController();
	CashInfoController cic = new CashInfoController();
	UserController uc = new UserController();
	
	// 리뷰 많은 순서로 보기
	public List<Product> arrayReview() {
		
		Collections.sort(pc.productList, new ReviewOrder());		
		return pc.productList;	
		
	}
	
	// 가격 높은 순서로 보기
	public List<Product> ascPrice() {
		
		Collections.sort(pc.productList, new PriceOrder());		
		return pc.productList;
		
	}
	
	// 가격 낮은 순서로 보기
	public List<Product> descPrice() {
		
		Collections.sort(pc.productList, new PriceOrder().reversed());		
		return pc.productList;
		
	}
	
	// 추천 많은 순서로 보기
	public List<Product> arrayRecom() {
		
		Collections.sort(pc.productList, new RecommendOrder());		
		return pc.productList;
	}
	
	// 주간 Hot 고정
	public void weekendHot() {
		
	}
	
	//  장바구니 넣기
	public void putCart(int index) {
		
		uc.printBasket();
		
		// 장바구니를 리스트로 만들어야 될 듯
		// get으로 가져온 상품 하나를 장바구니 리스트에 넣어야 함
		
		pc.productList.get(index);
	}
	
	// 구매 신청
	public void buyProduct(int index) {
		
		// getPrice가 가지고 있는 cash보다 작을 경우만 실행			
		// cash 보기
		// cash 사용
			
	}

}
