package com.mhj.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");	//991223-1234567
		
		String jumin = sc.next();
		
//		JuminCheck juminCheck = new JuminCheck();
//		
//		juminCheck.check1(jumin);
//		juminCheck.check2(jumin);
		
		JuminCheck2 juminCheck2 = new JuminCheck2();
		
		juminCheck2.check(jumin);

	}

}
