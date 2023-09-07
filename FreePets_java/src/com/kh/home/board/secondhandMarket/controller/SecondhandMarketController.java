package com.kh.home.board.secondhandMarket.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.secondhandMarket.model.SecondhandMarket;

public class SecondhandMarketController {
	
	ArrayList<SecondhandMarket> secondhmList = new ArrayList<>();
	
	// 상품 등록하기
	public void uploadProduct(SecondhandMarket shm) {
		secondhmList.add(shm);
	}
	// 상품 전체 목록
	public ArrayList<SecondhandMarket> secondhmList() {
		return secondhmList;
	}
	// 상품 검색하기
	public List<SecondhandMarket> searchProduct(String name) {	
		for(SecondhandMarket secondhandMarket: secondhmList) {
			if(secondhandMarket.getProductName().contains(name)) {
				// 중고마켓 반복문 돌려서 제품명 중 검색한 name을 포함하면....->상품 검색결과 반환...?
				
				// 상품 고유 식별 번호를 통해서 검색하는건 어떨까요?
			}
		}
		return null;
	}
	// 상품 삭제하기
	public boolean deleteProduct(SecondhandMarket shm) {
		return secondhmList.remove(shm);
	}
}
