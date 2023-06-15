package com.kh.home.board.petSitterService.controller;
import java.util.*;
import java.util.Scanner;
import com.kh.user.model.User;
import com.kh.home.board.petSitterService.model.Post;
import java.util.ArrayList;

public class PostController extends User {

	 ArrayList<Post> postList = new ArrayList<>();  
	  
	    // 글 내용 작성 
	    public boolean writePost(){
	    
	    	Scanner sc = new Scanner(System.in);
	    	
	    	
		      // 로그인이 된 상태이면 writePost 화면이 뜸 
	    	//String writer = user.getNickName();  // 작성자(writer) 란에 자동으로 유저의 닉네임 출력 되게 
	    	String title = sc.nextLine();
	    	String content = sc.nextLine();
	    	String imgUrl = sc.nextLine();
	    	String fileUrl = sc.nextLine();
	    	// 사용자가 하나씩 입력(제목,내용, 사진or 동영상 첨부)해서 문제가 없으면 글 작성 완료 -> true반환
	    	return false;
	    	
	    }
		
		// 글 수정
		public boolean modifyPost() {
			int index = 0;
			if(writePost() != true) //작성한 글이 없으면
				return false;
			
			
//			if(// 로그인이 안되었으면 )
//				return false;
			
			
			Scanner sc = new Scanner(System.in);
			String newtitle = sc.nextLine();
			String newcontent = sc.nextLine();
			String newimgUrl = sc.nextLine(); // 이미지, 파일 수정 ? 이게 아닌것 같지만 암튼,,
			String newfileUrl = sc.nextLine();
			
			postList.get(0).setContent(newcontent);
			postList.get(index).setTitle(newtitle);
			postList.get(index).setImgUrl(newimgUrl);
			postList.get(index).setFileUrl(newfileUrl);
			
			return true;
		}

	    //게시글 목록
	    public ArrayList<Post> postList(){
	    	return postList;
	    }
	    
		// 여러 게시글 리스트 중 게시글 1개 보기  
		public Post viewPost(int index) {
			return postList.get(index);
		}
		
	    // 글 삭제 
		public boolean deletePost(Post post) {
		
			return postList.remove(post);
		}
	
	    // 게시글 조회수 표시 
		public int viewpcount() {
			int pcount = 0;
			// ~~~~~~`
			
			return pcount;
		}
	
	  
	    // 게시글 업로드
	    public void upload(Post post) {
	    	postList.add(post);
	    }
}
