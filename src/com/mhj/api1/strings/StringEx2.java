package com.mhj.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력하세요.");
		String fileName = sc.next();
		
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(result);

		
		for (int i=0; i<names.length; i++) {
			boolean check = result.equals(names[i]);
			if (check == true) {
				System.out.println("이미지 파일을 업로드합니다.");
				break;
			} else {
				continue;
			}
			
		}
		

	}

}
