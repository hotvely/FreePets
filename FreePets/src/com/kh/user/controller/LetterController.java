package com.kh.user.controller;
import com.kh.user.model.*;
import java.util.*;
import java.time.*;

public class LetterController
{
	private ArrayList<Letter> letters;

	public boolean sendLetter(String id, String detail)
	{
		Letter letter = new Letter(detail, id, LocalDate.now());
		letters.add(letter);
		return true;
	}
	
	public ArrayList<Letter> printLetter()
	{
		return letters;
		
	}
	
}
