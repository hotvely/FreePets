package com.kh.user.controller;

import java.util.*;

import com.kh.user.model.*;

public class UserController 
{
//	User user = new User();
	HashMap<String, User> users = new HashMap<>();		//나중에 서버랑 연동할때 데이터 긁어 오는 코드 필요할듯?
	LetterController letterCtrl = new LetterController();

	public User user = null;
	private boolean isLogin = false;
	
	
	
	// 이거 제대로 저장소 저장된거 맞아???? 아 오ㅠ
	private void SetLogin(String id, boolean bl)
	{
		this.isLogin = bl;
		users.get(id).setLogin(isLogin);
	}
	
	public boolean GetLogin()
	{
		return this.isLogin;
	}
	
	//로그인
	public User logIn(String id, String pass) {
		/*
		 * 아이디, 비밀번호 한번에 싹 다 입력 받아서 
		 * 그냥 "존재하지 않는 아이디 이거나, 잘못된 비밀번호 입니다." 출력해버리기
		 * */
		if(users.containsKey(id) && users.get(id).getPassword().equals(pass))
		{	//아이디 있으면서 패스워드 동일할때;	
			SetLogin(id, true);
			user = users.get(id);
			return user;			
		}
		
		return null;
	}
	
	
	
	//로그아웃
	public boolean logOut(String id) {
		// 로그아웃 버튼이나 사용자가 로그아웃 인풋을 넣었을 경우에 반응하도록
		if(users.get(id).getLogin())
		{
			SetLogin(id, false);
			return true;
		}
		
		return false;
	}
	
	
	
	//회원가입
	public boolean signUp()
	{

		
		Scanner sc = new Scanner(System.in);
		// 사용자가 하나씩 데이터를 입력해서 문제가 없을 경우 회원 가입 성공!
		String id = sc.nextLine();
		if(users.containsKey(id))
			return false;
		
		String pass = sc.nextLine();
		String name = sc.nextLine();
		String nickName = sc.nextLine();
//		DB뒤져서 같은 닉네임 있으면 false ~
//		boolean isAvailable = userService.isNicknameAvailable(nickname);
//		if(isAvailable)
//			return false;
		
		Integer year = Integer.parseInt(sc.nextLine());
		Integer month = Integer.parseInt(sc.nextLine());
		Integer day = Integer.parseInt(sc.nextLine());
		
		// 관련 제어 처리 해주는 함수로 이용하면 편하겠지? 혹은 버튼식이거나
		Character gender = sc.nextLine().charAt(0);

		// '-' 짝대기 쓰는 사람 안쓰는 사람 구분해서 함수로 제어하면 좋을듯
		String phone = sc.nextLine();
		
		String email = sc.nextLine();
//		Integer cash = DB에서 받아오는거로 ~ 일단은 0!
		Integer cash = 0;
		
		
		users.put(id, new User(id,pass,name,nickName,year,month,day,gender,phone,email,cash));
		return true;
	}
	
	
	// 아이디 찾기
	public String searchId(String email, String phone)
	{
		// 로그인을 하지 않은 상태에서, 
		// 이름이나 폰,이메일을 비교해서 유저의 아이디를 넘겨줘야 함.

		String key = null;
		for(Map.Entry<String, User> entry : users.entrySet())
		{
		    // 동일한 값이 있으면 반복문을 종료합니다.
		    if(entry.getValue().getEmail().equals(email) && 
		    		entry.getValue().getPhone().equals(phone))
		    { // 값이 null이면 NullPointerException 예외 발생
		    	key = entry.getKey();
		    	break;
		    }
		}
		
		if(key != null)
			return users.get(key).getId();		
		else
			return null;
	}
	
	
	
	// 비밀번호 찾기
	public String searchPass(String id, String phone, String name, String email)
	{
		// 로그인을 하지 않은 상태에서, 데이터를 뒤지면서 아이디를 찾거나,
		// 아이디를 알고 있는 상태에서 이름이나 폰,이메일을 비교해서 유저의 비밀번호를 넘겨줘야 함.
		if(!users.containsKey(id))
			return null;
		
		if(users.get(id).getPhone().equals(phone) &&
				users.get(id).getEmail().equals(email) &&
				users.get(id).getName().equals(name))
			return users.get(id).getPassword();
		
		
		return null;
	}
	
	
	
	
	// 회원탈퇴
	public boolean removeUser(String id, String pass)
	{
		// 유저가 로그인이 되어 있는 상태에서 데이터 삭제 해 줘야함;
		if(users.containsKey(id) && users.get(id).getPassword().equals(pass))
		{
			users.remove(id);
			return true;
		}
		
		return false;
	}
	
	
	
	
	// 회원정보 수정
	public boolean updateUser(String id)
	{
		if(!isLogin)
			return false;
		
		if(!users.containsKey(id))
			return false;
		
		Scanner sc = new Scanner(System.in);
		String newPw = sc.nextLine();
		if(!chagePass(users.get(id), users.get(id).getPassword(), newPw))
			return false;
		
		String newName = sc.nextLine();
		users.get(id).setName(newName);
		
		//닉네임 중복처리 관련 코드 추가 필요함.
		String newNickName = sc.nextLine();
		users.get(id).setNickName(newNickName);
		
		String newPhone = sc.nextLine();
		users.get(id).setPhone(newPhone);
		
		String newEmail =sc.nextLine();
		users.get(id).setEmail(newEmail);
		
		// 기타 프로필 이미지 등록이라 던가.. 이런 것들 추가 필요할듯?
		
		
		return true;
	}
	
	public boolean chagePass(User user, String oldPw, String newPw)
	{
		if(user.getPassword().equals(oldPw))
		{
			user.setPassword(newPw);
			return true;
		}
		
		else
			return false;
	}
	
	public User searchUser(String id)	
	{
		return users.get(id);
	}
	
	// 장바구니
	public void printBasket()
	{
		
	}
	
	
	
	
	
	// 찜 확인
	
	
	
	
	
	
}
