package com.mhj.api4.network.servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.mhj.api2.collections.ex1.StudentDTO;

public class ServerDAO_T {
	
	//List의 내용들을 하나의 String으로 만들어 주는 메서드	
	public String makeList(ArrayList<ServerDTO> ar) {
		String result = "";
		StringBuffer sb = new StringBuffer();
		
		for(ServerDTO serverDTO:ar) {
			sb.append(serverDTO.getName());
			sb.append("-");
			sb.append(serverDTO.getNum());
			sb.append("-");
			sb.append(serverDTO.getKor());
			sb.append("-");
			sb.append(serverDTO.getEng());
			sb.append("-");
			sb.append(serverDTO.getMath());
			sb.append("-");
			sb.append(serverDTO.getTotal());
			sb.append("-");
			sb.append(serverDTO.getAvg());
			sb.append("-");
		}
		
		result = sb.toString();
		result = result.substring(0, result.length()-1);
		
		return result;
	}
	
	public ArrayList<ServerDTO> init() throws Exception {
		
		ArrayList<ServerDTO> ar = new ArrayList<>();
		
		//파일명 추적
		File file = new File("C:\\fileTest");		
		file = new File("C:\\fileTest", "student.txt");
		
		//----------------------------------------------
			
		//파일 읽기
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		boolean check = true;
		
		while (check) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(s, "-");
			ServerDTO serverDTO = new ServerDTO();
			serverDTO.setName(st.nextToken());
			serverDTO.setNum(Integer.parseInt(st.nextToken()));
			serverDTO.setKor(Integer.parseInt(st.nextToken()));
			serverDTO.setEng(Integer.parseInt(st.nextToken()));
			serverDTO.setMath(Integer.parseInt(st.nextToken()));
			serverDTO.setTotal(serverDTO.getKor()+serverDTO.getEng()+serverDTO.getMath());
			serverDTO.setAvg(serverDTO.getTotal()/3.0);
			
			ar.add(serverDTO);
		} //while 끝
		
		return ar;
		
	}

}
