package com.mhj.api4.network.servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServerDAO {
	
	private Scanner sc;
	private ArrayList<ServerDTO> ar;
	
	public ServerDAO() {
		sc = new Scanner(System.in);
	}
	
	//초기화
	public ArrayList<ServerDTO> init() {
		
		//파일명 추적
		File file = new File("C:\\fileTest");		
		file = new File("C:\\fileTest", "student.txt");
		
		//----------------------------------------------
		
		//파일 읽기
		FileReader fr = null;
		BufferedReader br = null;
		ar = new ArrayList<>();
		
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String data = null;
			
			while((data = br.readLine()) != null) {
				
				StringTokenizer st = new StringTokenizer(data, "-");
				
				ServerDTO serverDTO = new ServerDTO();
				serverDTO.setName(st.nextToken());
				serverDTO.setNum(Integer.parseInt(st.nextToken()));
				serverDTO.setKor(Integer.parseInt(st.nextToken()));
				serverDTO.setEng(Integer.parseInt(st.nextToken()));
				serverDTO.setMath(Integer.parseInt(st.nextToken()));
				ar.add(serverDTO);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return ar;
	
	}
	
	//검색
	public ServerDTO searchByName(ArrayList<ServerDTO> ar) {
		
		System.out.println("검색할 이름을 입력하세요.");
		String name = sc.next();
		
		ServerDTO st = null;	
		
		for(ServerDTO serverDTO:ar) {
			if(name.equalsIgnoreCase(serverDTO.getName())) {
				st = serverDTO;
				break;
			}
		}
		
		return st;
	}
	
	//

}
