package com.kh.user.model;

import java.time.LocalDate;
import java.util.*;

enum inout
{
	input,
	output,
	End;
	
	
}

public class CashInfo {
	
	private LocalDate date;
	private int inoutMoney;
//	private inout type;
	
	
	public CashInfo(LocalDate date, int inoutMoney) {
		this.date = date;
		this.inoutMoney = inoutMoney;
//		this.type = type;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getInoutMoney() {
		return inoutMoney;
	}
	public void setInoutMoney(int inoutMoney) {
		this.inoutMoney = inoutMoney;
	}
	
	
	
	
}
