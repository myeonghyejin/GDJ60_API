package com.mhj.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	//의존성
	private Scanner sc;
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		sc = new Scanner(System.in);
		studentDAO = new StudentDAO();		//의존성 주입
		studentView = new StudentView();	//의존성 주입
	}
	
	public void start() {
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생 정보 초기화");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 검색 조회");
			System.out.println("4. 학생 정보 추가");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("6. 학생 정보 백업");
			System.out.println("7. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				ar = studentDAO.init();
				System.out.println("초기화가 완료되었습니다.");
				break;
			case 2:
				studentView.view(ar);
				break;
			case 3:
				StudentDTO studentDTO = studentDAO.searchByName(ar);
				if (studentDTO != null) {
					studentView.view(studentDTO);
				} else {
					studentView.view("찾는 학생이 존재하지 않습니다.");
				}
				break;
			case 4:
				studentDAO.addStudent(ar);
				break;
			case 5:
				select = studentDAO.removeStudent(ar);
				if (select == 1) {
					studentView.view("삭제가 완료되었습니다.");
				} else {
					studentView.view("삭제되지 않았습니다.");
				}
				break;
			case 6:
				studentDAO.backup(ar);
				System.out.println("학생 정보가 백업되었습니다.");
			case 7:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			default:
				break;
			}
			
		}
		
	}

}
