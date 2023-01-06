package com.mhj.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {

		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력하세요.");
		String fileName = sc.next();
		
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(result);
		
		boolean check = false;
		
		for (int i=0; i<names.length; i++) {
			boolean equals = result.equals(names[i]);
			if (equals == true) {
				System.out.println("이미지 파일을 업로드합니다.");
				check = true;
				break;
			} else {
				continue;
			}			
		}
		
		if (check == false) {
			System.out.println("잘못된 확장자입니다.");
		}
		
	}

}

////선생님 답안
//
////확장자 분리
//int idx = fileName.lastIndexOf(".");
//String result2 = fileName.substring(idx + 1);
//
//boolean flag = true;
//
////확장자가 이미지인지 검증
//for (int i=0; i<names.length; i++) {
//	if(result2.equals(names[i])) {
//		System.out.println("정상 파일입니다.");
//		i=names.length;
//		flag =! flag;
//		break;
//	} else {
//	}
//}
//
//if(flag) {
//	System.out.println("비정상 파일이다.");
//}
//System.out.println("Finish");