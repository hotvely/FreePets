package com.kh.home.board.petSitterService.model;

import com.kh.user.model.User;

public class PetSitterService  {

	private User user = null;/*(펫시터 할 사람 정보)*/;
//	난 = 구하는 사람
//			나와 펫시터와의 관계  유저를 업데이트 해주고 바꿔서 갈아끼워줌 
	// 아니면.. 음.. 펫 시터 할 사람 아이디 정도만 알아도 될것 같기도?
	private String id = null;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
	
	
	
	
	
}
