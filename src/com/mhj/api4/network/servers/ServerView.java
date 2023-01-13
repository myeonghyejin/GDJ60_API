package com.mhj.api4.network.servers;

import java.util.ArrayList;

import com.mhj.api2.collections.ex1.StudentDTO;

public class ServerView {

	//1인 출력
	public void view(ServerDTO serverDTO) {
		
		System.out.println("이름 : " + serverDTO.getName());
		System.out.println("번호 : " + serverDTO.getNum());
		System.out.println("국어 : " + serverDTO.getKor());
		System.out.println("영어 : " + serverDTO.getEng());
		System.out.println("수학 : " + serverDTO.getMath());
		
		System.out.println("==================");
		
	}
	
	//전체 출력
	public void view(ArrayList<ServerDTO> ar) {
		
		for (ServerDTO serverDTO:ar) {
			this.view(serverDTO);
		}
		
	}
	
	//메시지 출력
	public void view (String msg) {
		System.out.println(msg);
	}
	
}
