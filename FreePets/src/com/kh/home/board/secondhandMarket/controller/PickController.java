package com.kh.home.board.secondhandMarket.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.secondhandMarket.model.Pick;


public class PickController {
	
	List<Pick> pickList = new ArrayList<>();

	
	//C: 로그인된 회원만 찜
	public boolean addPick(String pick) {	// 찜하기
		return false;
	}
	
	//R : 찜목록 보기	// 리스트 객체 만들어야하나..?
	public Pick pickList(int index) {
		return pickList.get(index);
	}

	//U : 찜 변경은...없나...?
	
	//D : 찜 해제하기
	public Pick removePick(int index) {
		return pickList.remove(index);
	}
	
}
