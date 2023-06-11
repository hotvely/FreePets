package com.kh.home.board.secondhandMarket.model;

import java.util.Objects;

public class Chat {

	private String id; //사용자 아이디
	private String message;	// 채팅
	private String Alarm;	// 채팅 알림 
	private String block; // 사용자 차단
	private String fileUrl; // 채팅 중 이미지 전송
	private String emoji;	// 이모지 사용

	public Chat() {}
	
	public Chat(String id, String message, String alarm, String block, String fileUrl, String emoji) {
		super();
		this.id = id;
		this.message = message;
		Alarm = alarm;
		this.block = block;
		this.fileUrl = fileUrl;
		this.emoji = emoji;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAlarm() {
		return Alarm;
	}

	public void setAlarm(String alarm) {
		Alarm = alarm;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	@Override
	public String toString() {
		return "Chat [id=" + id + ", message=" + message + ", Alarm=" + Alarm + ", block=" + block + ", fileUrl="
				+ fileUrl + ", emoji=" + emoji + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Alarm, block, emoji, fileUrl, id, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chat other = (Chat) obj;
		return Objects.equals(Alarm, other.Alarm) && Objects.equals(block, other.block)
				&& Objects.equals(emoji, other.emoji) && Objects.equals(fileUrl, other.fileUrl)
				&& Objects.equals(id, other.id) && Objects.equals(message, other.message);
	}
	
	
	
	
	
	
	
	
}
