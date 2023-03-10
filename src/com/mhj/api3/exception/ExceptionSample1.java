package com.mhj.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
	public void ex2() throws Exception {
		//유치원생, 2자리
		
		int num1 = 65;
		int num2 = 48;
		//int sum = num1 + num2;
		
		int sum = num2 - num1;
		if (sum < 0) {
			throw new CustomException("음수는 읽을 수 없어요.");
		}
		
		if (sum > 99) {
			throw new CustomException("세 자리 수는 몰라요.");
		}
		
	}

	public void ex1() throws ArithmeticException, NullPointerException, Exception {
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		System.out.println(num);
	}
}
