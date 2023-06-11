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
		
		// re -> 방법은 여러가지 일 것 같지만? ..
		// 1. 유저 객체에 펫시터 객체를 들고 있다면 지워 줘야 합니당
		// 2. 위에 HashMap을 사용하신 걸로 보면 아마 컨트롤러에서 서버쪽으로 펫시터들을 넘겨 주시려고 한 것으로 보입니다만,, 혹여나 나중에 데이터가 커진다던지, 
		//	  혹은 이용 유저가 많아서 수십만명의 펫 시터 데이터를 옮기려고 한다면 문제가 생길 수 도 있을것 같아요 이부분은 논의 필요할 것 같아용ㅎㅎ
		
		
}
