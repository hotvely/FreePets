package com.kh.home.board.petSitterService.controller;
import java.util.HashMap;

import com.kh.user.controller.UserController;
import com.kh.user.model.User;


public class PetSitterServiceController {

	// 이렇게 할 필요가 없을 것 같아요 아마..
	// 내가 가지고 있는 데이터에 펫시터는 한사람이면 충분하지 않을까요?
//	private HashMap<String, User > petsitter = new HashMap<>();
	private UserController uc = new UserController();

	// 나한테 등록된 펫시터 
	User petsitter = null; // (최대 등록 1명 , 2명,,? 정하기 )
	
	//펫시터 등록
	public boolean setPetSitter(String id) {
		// 유저 관련 정보라서 일단 유저컨트롤러 쪽에서 임시로 해결.
		petsitter = uc.searchUser(id); //유저 정보 반환 
		uc.user.setSitter(petsitter);	
		// 유저 정보 받아와서 등록..?
		return true;
	}
	
	//펫시터 업데이트 // 펫시터 완료 후 삭제되면 이 과정은 굳이 필요없지 않나?
		public boolean updatePetSitter(String id) {
			
			// 위에 setPetSitter함수 불러다가 그냥 덮어 써도 될것 같습니다아;
			this.setPetSitter(id);
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
		
	//펫시터 삭제하기
		public boolean deletePetSitter() {
			//펫시터 삭제하기 버튼 누르면 작동
			
			petsitter = null;
			// 나중에 채우기 
			return true;
		}
}
