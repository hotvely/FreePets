package com.kh.home.board.petVideo.controller;

import java.util.ArrayList;

import com.kh.home.board.petVideo.model.PetVideo;

public class PetVideoController {

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
	
	// 수정 (동영상 수정)
	
	// 삭제 (동영상 삭제)
	
	
	
	
}
