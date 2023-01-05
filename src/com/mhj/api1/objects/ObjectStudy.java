package com.mhj.api1.objects;

public class ObjectStudy {

	public static void main(String[] args) {

		//객체 생성 공식
		//타입 변수명 = new 생성자
		
		Object object = new Object();
		
		//멤버 사용(접근)
		//참조변수명.변수명
		//참조변수명.메서드명()
		
		int a = object.hashCode();
		
		System.out.println(a);
		System.out.println(object.hashCode());
		
		//--------------------------------------
		
		String b = object.toString();
		System.out.println(b);
		System.out.println(object.toString());
		System.out.println(object);
		
		//--------------------------------------
		
		Child child = new Child();
		child.toString();
		
		//--------------------------------------
		
		Object obj = new Object();
		System.out.println(object == obj);		
		boolean check = object.equals(obj);
		System.out.println(check);
		
		//--------------------------------------
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());

		//--------------------------------------
		
		//다른 타입에 대입, 다형성
		Object o = child;
		
		
		
	}

}
