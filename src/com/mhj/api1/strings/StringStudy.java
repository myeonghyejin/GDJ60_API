package com.mhj.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {

		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str==str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		char result = str.charAt(0);
		System.out.println("char : " + result);
		
//		Scanner sc = new Scanner(System.in);
//		result = sc.next().charAt(0);
		
		int num = str.indexOf('d');
		System.out.println("int : " + num);

	}

}
