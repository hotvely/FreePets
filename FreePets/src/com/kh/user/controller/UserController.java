package com.kh.user.controller;

import com.kh.user.model.*;

public class UserController 
{
	User user = new User();
	
	// 이거 제대로 저장소 저장된거 맞아???? 아 오ㅠ
	
	//로그인
	public boolean lonIn(String id, String pass) {
		/*
		 * 아이디, 비밀번호 한번에 싹 다 입력 받아서 
		 * 그냥 "존재하지 않는 아이디 이거나, 잘못된 비밀번호 입니다." 출력해버리기
		 * */
		
		
		
		return false;
	}
	
	
	
	//로그아웃
	public boolean lonOut() {
		// 로그아웃 버튼이나 사용자가 로그아웃 인풋을 넣었을 경우에 작동하는 기능
		
		return false;
	}
	
	
	
	//회원가입
	public boolean signUp()
	{
		// 사용자가 하나씩 데이터를 입력해서 문제가 없을 경우 회원 가입 성공!
		
		
		return false;
	}
	
	
	// 아이디 찾기
	public String searchId()
	{
		// 로그인을 하지 않은 상태에서, 
		// 이름이나 폰,이메일을 비교해서 유저의 아이디를 넘겨줘야 함.
		
		return this.user.getId();
	}
	
	
	
	// 비밀번호 찾기
	public String searchPass()
	{
		// 로그인을 하지 않은 상태에서, 데이터를 뒤지면서 아이디를 찾거나,
		// 아이디를 알고 있는 상태에서 이름이나 폰,이메일을 비교해서 유저의 비밀번호를 넘겨줘야 함.
		
		return this.user.getPassword();
	}
	
	
	
	
	// 회원탈퇴
	public boolean removeUser()
	{
		// 유저가 로그인이 되어 있는 상태에서 데이터 삭제 해 줘야함;
		
		return false;
	}
	
	
	
	
	// 회원정보 수정
	public boolean modifyUserInfo()
	{
		
		
		
		
		return false;
	}
	
	
	
	
	// 유저간 쪽지 보내기
	public boolean sendLetter(/*매개변수로 유저 받을지 그냥 아이디만 스트링으로 받을지 고민중..*/)
	{
		// 얘는 ... 서버쪽이랑 통신이 되야 할 듯?
		
		
		
		return false;
	}
	
	
	
	// 쪽지 전체 출력하기
	public void printLetter()
	{
		
	}
	
	
	
	// 캐쉬 충전
	public boolean pushCash(int money)
	{
		
		
		
		return false;
	}
	
	
	
	// 캐쉬 환급
	public boolean outputCash(int money)
	{
		
		
		return false;
	}
	
	
	
	
	
	// 장바구니
	public void printBasket()
	{
		
	}
	
	
	
	
	
	// 찜 확인
	
	
	
	
	
	
}
