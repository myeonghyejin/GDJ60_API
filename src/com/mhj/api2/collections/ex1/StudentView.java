package com.mhj.api2.collections.ex1;

public class StudentView {
	
	public void view(StudentDTO studentDTO) {
		System.out.println("이름     : " + studentDTO.getName());
		System.out.println("번호     : " + studentDTO.getNum());
		System.out.println("국어 점수 : " + studentDTO.getKor());
		System.out.println("영어 점수 : " + studentDTO.getEng());
		System.out.println("수학 점수 : " + studentDTO.getMath());
		System.out.println("총점     : " + studentDTO.getTotal());
		System.out.println("평균     : " + studentDTO.getAvg());
		System.out.println("---------------");
	}
	
	public void view() {
		
	}

}
