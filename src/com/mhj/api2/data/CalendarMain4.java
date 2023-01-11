package com.mhj.api2.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		
		//2023년 1월 11일 -> format
		
		SimpleDateFormat sd = new SimpleDateFormat();
		sd.applyPattern("yyyy-mm-dd-E");
		String p = sd.format(ca.getTime());
		
		System.out.println(p);
		
	}

}
