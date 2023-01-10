package com.mhj.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("IU-1-90-60-70-");
		sb.append("Winter-2-86-84-75-");
		sb.append("Suzy, 3, 89, 74, 87 ");
		sb.append("Choa, 4, 71, 25, 99 ");
	}
	
	public ArrayList init () {
		
		StringTokenizer st = new StringTokenizer("-,");
		
		ArrayList<StudentDTO> ar = new ArrayList<>();		
				
		while (st.hasMoreTokens()) {
			
			for(int i=0; i<st.countTokens(); i++) {
				
				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setName(st.nextToken());
				ar.add(studentDTO);
				studentDTO.setNum(Integer.parseInt(st.nextToken()));
				ar.add(studentDTO);
				studentDTO.setKor(Integer.parseInt(st.nextToken()));
				ar.add(studentDTO);
				studentDTO.setEng(Integer.parseInt(st.nextToken()));
				ar.add(studentDTO);
				studentDTO.setMath(Integer.parseInt(st.nextToken()));
				ar.add(studentDTO);
//				studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
//				ar.add(studentDTO);
//				studentDTO.setAvg((studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath())/3);
//				ar.add(studentDTO);
				
			}
				
			}
		
		return ar;
		
	}

}
