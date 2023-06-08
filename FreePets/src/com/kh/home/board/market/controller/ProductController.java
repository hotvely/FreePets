package com.kh.home.board.market.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.market.model.Product;

public class ProductController {
	
	
	
	List<Product> productList = new ArrayList<>();
	
	// 펫 용품 판매 사이트에서 상품을 연동해 객체에 저장
	
	
	// 저장된 상품을 펫 용품 리스트에 추가
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	// 펫 용품 1개 보기
	public Product viewProductInfo(int index) {
		return productList.get(index);
	}
	
	// 리뷰 작성
	
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
