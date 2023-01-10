package com.mhj.api2.collections.ex1;

import java.util.Scanner;

public class MenuController {

	//학생은 이름, 번호, 국어, 영어, 수학, 총점, 평균으로 이루어져 있음
	//1. 학생 정보 초기화
	//2. 학생 정보 전체 조회
	//3. 학생 정보 검색 조회 (이름으로 검색)
	//4. 학생 정보 추가
	//5. 학생 정보 삭제 (이름)
	//6. 프로그램 종료
	
	public void start () {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO studentDAO = new StudentDAO();
		
		boolean check = true;
		
		while (check) {
			
			System.out.println("1. 학생 정보 초기화");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 검색 조회");
			System.out.println("4. 학생 정보 추가");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("6. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			default:
				System.out.println("오류입니다. 다시 선택하세요.");
				break;
			}
			
		}
		
	}
	

	
}
