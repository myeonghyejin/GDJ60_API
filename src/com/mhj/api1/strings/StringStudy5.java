package com.mhj.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {

		String str = "1.2#3.4,5.2#60";
		
		str = str.replace(',', '#');		//전처리 작업
//		str = str.replace(" ", "");

		
		String [] result = str.split("#");
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i].trim());
		}

	}

}
