package com.mhj.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {

		//컴파일 에러
//		int num;
//		System.out.println(num);
		
		//exception1
//		String st = null;
//		System.out.println(st.charAt(0));
		
		//exception2
		String st = null;
		
		Random random = new Random();
		int n = random.nextInt(2);
		
		if (n == 0) {
			st = "test";
		}
		
		try {
			int a = 10;
			System.out.println(3/n);
			//throw new ArithmeticException();
			System.out.println(st.charAt(n));
			//throw new NullPointerException();
			
			//다형성
		} catch(ArithmeticException e) {
			System.out.println("예외 발생");
			int a = 100;
		} catch(RuntimeException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		} catch(Throwable e) {
			
		}
		//System.out.println(a);
		System.out.println("종료합니다.");
		
	}

}
