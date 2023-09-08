package com.kh.user.model;
import java.time.LocalDate;

public class Letter 
{
	String detail;
	String sendId;
	LocalDate sendTime;
	
	
	public Letter() {
	}


	public Letter(String detail, String sendId, LocalDate sendTime) {
		super();
		this.detail = detail;
		this.sendId = sendId;
		this.sendTime = sendTime;
	}


	@Override
	public String toString() {
		return "Letter [sendId=" + sendId + "님이 쪽지를 보냈습니다. \n내용=" + detail + "\n(보낸시간=" + sendTime + ")]";
	}
	
	
	
}
