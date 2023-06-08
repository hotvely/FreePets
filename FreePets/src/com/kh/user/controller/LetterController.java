package com.kh.user.controller;
import com.kh.user.model.*;
import java.util.*;
import java.time.*;

public class LetterController
{
	private ArrayList<Letter> letters = new ArrayList<>();
	private UserController uc = new UserController();
	
	
	// C 쪽지 보내기
	public boolean sendLetter(String id, String pass, Letter letter)
	{
		if(uc.logIn(id, pass))
		{
			letters.add(letter);
			
		}
		return true;
	}
	
	// R 쪽지 보기
	public ArrayList<Letter> printLetter()
	{
		return letters;
	}
	
//	U 쪽지 수정 ... 은 없을예정
//	D 쪽지 삭제 ... 음..일단 고민좀;
	public boolean deleteLetter(User user, int idx)
	{
		// 일단 로그인 체크는 하는데...
		// 위에서 로그인 해 놓은 상태이면 그냥 메모리 잡고 bool변수로 제어해도 될듯..?
		uc.logIn(user.getId(), user.getPassword());
		
		letters.remove(idx);
		
		return false;
	}
	
	
	
	
}
