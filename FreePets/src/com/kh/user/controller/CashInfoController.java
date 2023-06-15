package com.kh.user.controller;

import com.kh.user.model.*;

import java.time.LocalDate;
import java.util.*;

public class CashInfoController {
	
	private UserController uc = new UserController();
	private User user = null;
	
	
	/* 
	 * 어차피 나중에 가면 서버랑 연동해주는 곳에서 로그인 되어 있는지
	 * 아마 bool변수로 저장해 놓을 거니까 ..??? 아마?
	 * 걍 일단 지금은 다 유저 컨트롤러쪽 갖고 와서 로그인 함수 때리박아서
	 * 유저 보고 뭐 할 때 마다 로그인 해라 라고 시키지뭐.
	 *
	 */
	
	//캐시 충전
	public boolean pushCash(String id, String pass, int money)
	{
		user = uc.logIn(id, pass);
		if(user != null)
		{
			user.setCashInfo(new CashInfo(LocalDate.now(), money));
			
			return true;
		}
		
		return false;
	}
	
	//캐시 사용
	public void useCash(String id, String pass, int money)
	{

		user = uc.logIn(id, pass);
		if(user != null)
		{
			user.setCashInfo(new CashInfo(LocalDate.now(), -money));
		}
		
	}
	
	//캐시 보기
	public String printCash(String id, String pass)
	{
		user = uc.logIn(id, pass);
		if(user != null)
			return Integer.toString(user.gettotalCash());
		
		else
			return null;
	}
	
	//캐시 환급
	public void outputCash(String id, String pass, int money)
	{
		user = uc.logIn(id, pass);
		if(user != null)
			user.setCashInfo(new CashInfo(LocalDate.now(), -money));
		
			
	}
	
}
