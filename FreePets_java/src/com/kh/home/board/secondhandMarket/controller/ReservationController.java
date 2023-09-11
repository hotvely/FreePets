package com.kh.home.board.secondhandMarket.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.home.board.secondhandMarket.model.Reservation;

public class ReservationController {
	
	List<Reservation> reservationList = new ArrayList<>();
	
	public boolean addreservation(Reservation reservation) {	// 예약 관련 정보 가져오기
		return false;	// 예약하면 예약 생성
	}
	
	public Reservation viewReserve(int index) {	// 예약 내역 보기
		return reservationList.get(index);
	}
	
	public void changeReservation(/*해당 예약 넘버 필요하지 않을까*/) {	//예약 변경하기
		
	}
	
	public Reservation cancelReservation () {	//예약 취소하기
		return reservationList.remove(0);  
	}
}
