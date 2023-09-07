package com.kh.home.board.common.controller;

import java.util.ArrayList;

import com.kh.home.board.common.model.Comment;
import com.kh.home.board.common.model.Common;
import com.kh.home.board.common.model.Report;

public class CommonController {
	ArrayList<Common> boards = new ArrayList<>();
	CommentController cc = new CommentController();
	
	public void newBoard(String title, String detail, String writer) {
//		private String boardTitle;
//		private String boardDetail;
//		private String writer;
		boards.add(new Common(title, detail, writer));
		// 이부분 유저가 로그인 했는지 확인하는 스태이터스 + writer 는 로그인 한 유저 기준으로 작성돼야함 (권한 로그인)
		
	}
	public void updateBoard(String oldTitle, String title, String detail, String writer) {
		
		for(Common c:boards) {
			if(c.getBoardTitle().equals(oldTitle)) {
				c.setBoardTitle(title);
				c.setBoardDetail(detail);
			}
		}
		// 업데이트 할 제목 선택 후 제목 내용 변경하는 부분입니다. (권한 본인)
	}
	
	public void readBoard(String title) {
		
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				System.out.println(c);
			}
			
		}
	}
	// 게시글 제목 클릭해 게시글 읽는 기능입니다. (권한 전체 || 로그인)
	    
	
	public void deleteBoard(String title) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				boards.remove(c);
			}
			
		}
		
	} // 게시글 제목 확인 후 게시글 삭제하는 기능입니다. (권한 본인, 관리자)
	
	public void likeBoard(String title) {
		
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				c.setLikes(c.getLikes()+1);
			}
			
		}
		
		
	} // 게시글 좋아요 기능 (권한 로그인)
	public void newComment(String title,String writer, String describe) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				c.getComments().add(new Comment(writer, describe));
			}
			
		}
		
	} // 댓글 추가 (권한 로그인) 
	
	public void viewComment(String title) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				System.out.println(c.getComments());
			}
			
		}
		
	}// 댓글 보기 기능 (권한 모두)
	
	
	public void deleteComment(String title, String writer) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)&&c.getComments().get(c.getComments().indexOf(writer))!=null) {
				c.getComments().remove(c.getComments().indexOf(writer));
			}
			
		}
		
	} // 댓글 삭제 (권한 작성자)
	
	
	public void updateComment(String title, String writer, String comment) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)&&c.getComments().get(c.getComments().indexOf(writer))!=null) {
				c.getComments().get(c.getComments().indexOf(writer)).setDescribe(comment);
			}
			
		}
		
	} // 댓글 수정 (권한 작성자)
	public void likeComment(String title, String writer) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)&&c.getComments().get(c.getComments().indexOf(writer))!=null) {
				c.getComments().get(c.getComments().indexOf(writer)).setLikes(c.getComments().get(c.getComments().indexOf(writer)).getLikes()+1);
			}
			
		}
		
	} // 댓글 좋아요 (권한 로그인 유저)
	
	
	
	/*
	 * 
	 * 댓글부분 중복된 부분 추후 수정하겠습니다.
	 * 컨트롤 분리 같은 경우에 필요할 시 그때 분리하겠습니다
	 * 
	 * 
	 */
	//c 
	public void sendReport(String title, String reporttitle, String describe, String writer) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				c.getReports().add(new Report(writer, reporttitle, describe));
			}
		}
	}// 신고하기 기능 (권한 로그인 한 유저)
	
	public void readReport(String title) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)) {
				System.out.println(c.getReports());
			}
		}
		
	}// 신고 검토기능 (권한 관리자) 
	// 이거 같은 경우에는 하나하나가 중요한게 아닌 전체적 내용이 중요하다 생각해 전체를 받아오도록 만들었습니다.
	
	public void deleteReport(String title, String reporttitle) {
		for(Common c:boards) {
			if(c.getBoardTitle().equals(title)&&c.getReports().get(c.getReports().indexOf(reporttitle))!=null) {
				c.getReports().remove(c.getReports().indexOf(reporttitle));
			}
		}
		
	}
	/*
	 * 
	 * 신고기능 노란줄 뜨는 부분 수정 필요 오브젝트 형식으로 넣을거지만 한번에 인덱스 구하는 식으로 접근예정
	 * 
	 */
	
	//r
	//u
	//d
	

	
	
	
	
	
	
	
	
	
	
}
