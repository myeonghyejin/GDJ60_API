package com.mhj.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.UUID;

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
		
		//1. 파일의 정보를 담는 객체 준비
		//파일 정보 File
		File file = new File(file, max + ".txt");
		
		String [] names = file.list();
		long max = 0;
		
		for (String name:names) {
			name = name.substring(0, name.lastIndexOf("."));
			long date = Long.parseLong(name);
			
			if(date>max) {
				max = date;
			}
		}
		
		//2. 파일 내용 읽기 위해서 연결 준비
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		try {		
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String data = null;
			
			while((data = br.readLine()) != null) {
				data = data.replace(" ", "-");
				data = data.replace(",", "");
				
				StringTokenizer st = new StringTokenizer(data, "-");
				
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
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				
			}
		}
		
		
		//String data = this.sb.toString();
		
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
	
	//6. 학생 정보 백업
	//현재 시간을 파일명으로 해서 파일 작성
	public void backup(ArrayList<StudentDTO> ar) {
		String name = UUID.randomUUID().toString();
		Calendar calendar = Calendar.getInstance();
		name = "studentsInfoBackup_" + calendar.getTimeInMillis();
		File file = new File("C:\\fileTest", name + ".txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			for (StudentDTO studentDTO : ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("\r\n");
				
				fw.write(sb.toString());
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
}
