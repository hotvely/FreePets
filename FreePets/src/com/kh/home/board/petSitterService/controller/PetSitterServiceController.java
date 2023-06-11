package com.kh.home.board.petSitterService.controller;
import java.util.HashMap;

import com.kh.user.model.User;


public class PetSitterServiceController {

	
	private HashMap<String, User > petsitter = new HashMap<>();
    
	
	//펫시터 등록
	public boolean setPetSitter() {
		
		// 유저 정보 받아와서 등록..?
		return false;
	}
	
	//펫시터 업데이트
		public boolean updatePetSitter() {
			
			//유저가 존재한다면 해당 유저 정보 불러와서 변경 
			return false;
		}
	
    //펫시터 프로필 보기 
		public User viewPetSitter() {
			return null; // 유저의 프로필 반환 
		}
		
	//펫시터 삭제 	삭제는 필요 없지요,,? 펫시터를 새로 구할 때마다 업데이트만 해주면 되니깐? 
		// 유저가 탈퇴한다면?,, 삭제되는건가,,?
}
