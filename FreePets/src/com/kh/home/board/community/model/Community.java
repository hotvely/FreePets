package com.kh.home.board.community.model;

public class Community {
    public String id;
    public String title;
    public String content;
    public int view;
    public int like;
    
    public int getLike() 
    {
        return like;
    }
    public void setLike(int like) 
    {
        this.like = like;
    }
}