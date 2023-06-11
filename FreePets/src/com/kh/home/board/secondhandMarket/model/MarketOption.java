package com.kh.home.board.secondhandMarket.model;

import java.util.Objects;

public class MarketOption {
	private String pick;	// 관심목록(찜)
	private String reserve; // 예약

	public MarketOption() {}

	public MarketOption(String pick, String reserve) {
		super();
		this.pick = pick;
		this.reserve = reserve;
	}

	public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	@Override
	public String toString() {
		return "ChatOption [pick=" + pick + ", reserve=" + reserve + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pick, reserve);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketOption other = (MarketOption) obj;
		return Objects.equals(pick, other.pick) && Objects.equals(reserve, other.reserve);
	}
	
	
	
	
}
