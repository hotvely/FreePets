package com.kh.home.board.secondhandMarket.model;

public class SecondhandMarket {
	
	private String id; // 사용자 아이디
	private String imageurl;	// 상품 썸네일
	private String productName;	// 상품 이름
	private int productPrice;	// 상품 가격
	private String date; //게시일 
	private String seller; // 판매자
	private int likeCount; //좋아요 개수
	private int chatCount;	//연락 온 채팅 개수
	private String searchProduct; // 상품 검색하기
	
	public SecondhandMarket() {}

	public SecondhandMarket(String id, String imageurl, String productName, int productPrice, String date,
			String seller, int likeCount, int chatCount, String searchProduct) {
		super();
		this.id = id;
		this.imageurl = imageurl;
		this.productName = productName;
		this.productPrice = productPrice;
		this.date = date;
		this.seller = seller;
		this.likeCount = likeCount;
		this.chatCount = chatCount;
		this.searchProduct = searchProduct;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getChatCount() {
		return chatCount;
	}

	public void setChatCount(int chatCount) {
		this.chatCount = chatCount;
	}

	public String getSearchProduct() {
		return searchProduct;
	}

	public void setSearchProduct(String searchProduct) {
		this.searchProduct = searchProduct;
	}

	@Override
	public String toString() {
		return "SecondhandMarket [id=" + id + ", imageurl=" + imageurl + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", date=" + date + ", seller=" + seller + ", likeCount="
				+ likeCount + ", chatCount=" + chatCount + ", searchProduct=" + searchProduct + "]";
	}
	
	//해쉬코드&이퀄스...필요....?
	
	
	
	
	
}
