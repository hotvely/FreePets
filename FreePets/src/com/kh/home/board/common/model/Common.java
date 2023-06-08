package com.kh.home.board.common.model;

import java.sql.Date;
import java.util.ArrayList;

public class Common {
	
	
	private String boardTitle;
	private String boardDetail;
	private String writer;
	private Date date;
	private int likes;
	private ArrayList<Comment> comments = new ArrayList<>();
	private ArrayList<Report> reports = new ArrayList<>();
	
	
}