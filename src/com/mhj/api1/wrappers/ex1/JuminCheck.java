package com.mhj.api1.wrappers.ex1;

public class JuminCheck {
	
	//check1
	//주민등록번호를 받아서
	//남성인지 여성인지 출력
	
	public void check1 (String Jumin) {
		if(Jumin.charAt(7) == '1' || Jumin.charAt(7) == '3') {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
	}
	
	//check2
	//주민등록번호를 받아서
	//나이를 계산해서 출력
	//3-5 : 봄
	//6-8 : 여름
	//9-11 : 가을
	//12-2 : 겨울
	
	public void check2 (String Jumin) {
		
		//나이 출력
		String y = Jumin.substring(0, 2);
		String year = "19";
		
		char check = Jumin.charAt(7);
		
		if (check == '3' || check == '4') {
			year = "20";
		}
		
		year = year + y;
		
		int year2 = Integer.parseInt(year);
		
		int age = 2023 - year2;
		System.out.println("나이는 " + age + "살입니다.");
		
		//-----------------------------------------------
		
		//계절 출력
		String m = Jumin.substring(2, 4);		
		
		int month = Integer.parseInt(m);
		
		if (month>=3 && month<=5) {
			System.out.println("봄에 태어났습니다.");
		} else if (month>=6 && month<=8) {
			System.out.println("여름에 태어났습니다.");
		} else if (month>=9 && month <=11) {
			System.out.println("가을에 태어났습니다.");
		} else {
			System.out.println("겨울에 태어났습니다.");
		}
		
//		if (m.equals("01") || m.equals("04") || m.equals("05")) {
//			System.out.println("봄에 태어났습니다.");
//		} else if (m.equals("06") || m.equals("07") || m.equals("08")) {
//			System.out.println("여름에 태어났습니다.");
//		} else if (m.equals("09") || m.equals("10") || m.equals("11")) {
//			System.out.println("가을에 태어났습니다.");
//		} else {
//			System.out.println("겨울에 태어났습니다.");
//		}
		
	}

}
