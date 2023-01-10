package com.mhj.api2.collections.ex1;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	private Scanner sc;
	
	public StudentDAO() {

		this.sb = new StringBuffer();	
		sb.append("IU-1-90-60-70-");
		sb.append("Winter-2-86-84-75-");
		sb.append("Suzy, 3, 89, 74, 87 ");
		sb.append("Choa, 4, 71, 25, 99 ");
		
		this.sc = new Scanner(System.in);
	}
	
	//1. 학생 정보 초기화
	public ArrayList<StudentDTO> init() {
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		
		StringTokenizer st = new StringTokenizer(data, "-");
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			ar.add(studentDTO);
		}
		
		return ar;
		
	}
	
	//3. 학생 정보 검색 조회
	public StudentDTO searchByName (ArrayList<StudentDTO> ar) {
		
		System.out.println("검색할 이름을 선택하세요.");
		String name = sc.next();
		
		StudentDTO st = null;
		
		for (StudentDTO studentDTO: ar) {
			if (name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			} 
		}
		
		return st;
		
	}
	
	//4. 학생 정보 추가
	public void addStudent (ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		
		System.out.println("이름을 입력하세요.");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력하세요.");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 점수를 입력하세요.");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 점수를 입력하세요.");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 점수를 입력하세요.");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);

	}
	
	//5. 학생 정보 삭제

	public int removeStudent (ArrayList<StudentDTO> ar) {
		
		//삭제 확인용 변수
		//0이면 삭제 실패, 1이면 삭제 성공
		int result = 0;
		
		System.out.println("삭제할 이름을 입력하세요.");
		String name = sc.next();
		
		//ar.remove(인덱스 번호)
		for(int i=0; i<ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		
		//ar.remove(Object)
//		for (StudentDTO studentDTO:ar) {
//			if(name.equals(ar.get(0).getName())) {
//				ar.remove(studentDTO);
//				result = 1;
//				break;
//			}
//		}
		
		return result;
		
	}
		
}
