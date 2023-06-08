package com.kh.user.model;

public class User {

	private String id, password;
	private String name, nickName;
	private Integer year,month,day;
	private Character gender;
	private String phone, email;
	private Integer cash;
	
	public User()
	{
		// 기본 생성자
	}
	
	public User(String id, String password, String name, String nickName, Integer year, Integer month, Integer day,
			Character gender, String phone, String email, Integer cash) 
	{
		this.id = id;		
		this.password = password;
		this.name = name;
		this.nickName = nickName;
		this.year = year;
		this.month = month;
		this.day = day;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.cash = cash;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}
	
	

	
	
}
