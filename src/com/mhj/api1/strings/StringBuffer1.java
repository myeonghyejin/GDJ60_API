package com.mhj.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {

		//StringBuffer
		//String이 아님

		StringBuffer sb = new StringBuffer("Hello");	//hello
		
		//hello + world
		
		sb.append("World");
		
		System.out.println(sb);
		
		//참조 변수를 출력하면 toString() : 클래스명@객체주소
		//toString을 오버라이딩했다.
		//변수에는 같은 데이터타입만 대입 가능
		
		String str = sb.substring(0);
		
		str = sb.toString();
		
		System.out.println(str);
		
		sb.reverse();
		
		System.out.println(sb);

		
		//static이 붙은 애들은 클래스명.~~ 라고 쓰는 거 기억하기
		str = String.valueOf(123);
		System.out.println(str);
		
		str = 123 + "";
		
	}

}
