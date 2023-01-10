package com.mhj.api2.collections.ex1;

public class Ex1Main {

	public static void main(String[] args) {

		//학생은 이름, 번호, 국어, 영어, 수학, 총점, 평균으로 이루어져 있음
		//1. 학생 정보 초기화
		//2. 학생 정보 전체 조회
		//3. 학생 정보 검색 조회 (이름으로 검색)
		//4. 학생 정보 추가
		//5. 학생 정보 삭제 (이름)
		//6. 프로그램 종료
		
		MenuController menuController = new MenuController();
		
		menuController.start();

	}

}
