package com.mhj.api2.data;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		birth.set(1996, 3, 26);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE));
		
		//현재 시간을 밀리세컨즈로 변환
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		
		n = n-s;
		
		n = n/(1000*60*60*24);
		n = n/365;
		
		System.out.println("n : " + n);
		System.out.println("s : " + s);
		
		System.out.println(now.getTime());

	}

}
