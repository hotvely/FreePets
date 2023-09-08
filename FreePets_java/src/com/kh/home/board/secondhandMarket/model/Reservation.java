package com.kh.home.board.secondhandMarket.model;

import java.util.Date;

public class Reservation {
//	private User user;  예약하기 위한 유저 정보
	private String id;	//로그인 필요
	private String sellerInfo;	// 판매자 정보
	private String reserveStatus;	// 예약 상태
	private String payFor; //결제 방법
	private Date reservationdDate;	// 예약일시
	private SecondhandMarket secondhandMarket; // 예약하기 위한 상품 정보...포함..여기 맞나...?
	
}
