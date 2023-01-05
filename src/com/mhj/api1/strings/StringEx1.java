package com.mhj.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {

		//
		String phone = "010-1234-5678";
		
		for (int i=0; i<phone.length(); i++) {
			int num = phone.charAt(i);
			if(num != '-') {
				continue;
			} else {
				System.out.println(phone.indexOf('-', i));
			}
		}
		
	}

}


//선생님 답안
//
//boolean check = true;
//int idx = 0;
//
//while(check) {
//	idx = phone.indexOf('-', idx);
//	if (idx != -1) {
//		System.out.println("IDX : " + idx);
//		idx++;
//	} else {
//		check = false;
//	}
//}