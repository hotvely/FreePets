package com.kh.home.board.petVideo.controller;
import java.util.*;


import com.kh.home.board.petVideo.model.PetVideo;

public class PetVideoController {

//	+ 유튜브 연동..
	
	ArrayList<PetVideo> videoList = new ArrayList<>();
	
	
	// 추가 (동영상 업로드)
	public void upload(PetVideo petvideo) {
		videoList.add(petvideo);
	}
	
	// 동영상 목록 
	public ArrayList<PetVideo> videoList(){
		return videoList;
	}
	
	
	// 보기 (동영상 한개 보기)
	public PetVideo viewVideo(int index) {
		return videoList.get(index);
	}
	
	// 수정 (동영상 수정= 업데이트)
	public void updateVideo(int index, PetVideo petvideo) {
		videoList.set(index, petvideo);
	}
	
	
	// 삭제 (동영상 삭제)
	public boolean deletePetVideo(PetVideo petvideo) {
		return videoList.remove(petvideo);
	}
	
	
}
