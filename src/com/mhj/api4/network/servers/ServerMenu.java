package com.mhj.api4.network.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import com.mhj.api2.collections.ex1.StudentDTO;

public class ServerMenu {
	
	private ServerSocket ss;
	private Socket socket;
	
	private Scanner sc;
	private ServerView serverView;
	private ServerDTO serverDTO;
	private ServerDAO_T serverDAO;
	private ArrayList<ServerDTO> ar;
	
	public ServerMenu() {
		sc = new Scanner(System.in);
		serverDAO = new ServerDAO_T();
		serverView = new ServerView();
	}
	
	public void menu() throws Exception {
		
		ss = new ServerSocket(8282);
		socket = ss.accept();
		
		serverDAO = new ServerDAO_T();
		ArrayList<ServerDTO> ar = serverDAO.init();
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		boolean check = true;
		
		while (check) {
			String select = br.readLine(); //선택번호?data
			String [] s = select.split(":");
			
			switch(s[0]) {
			case "1":
				//1:
				select = serverDAO.makeList(ar);
				break;
			case "2":
				//2:iu
				select = serverDAO.searchByName(ar, s[1]);
				break;
			case "3":
				//3:iu-4-50-75-81
				//s[1]
				select = serverDAO.addStudent(ar, s[1]);
				break;
			case "4":
				//4:
				break;
			case "5":
				//5:
				check = false;
				break;
			default:
				
			}
			
			if(check) {
				bw.write(select + "\r\n");
				bw.flush();
			}
			
			
		}
		
		
		
//		boolean check = true;
//			
//		while(check) {
//			
//			int select = sc.nextInt();
//			
//			switch(select) {
//			case 1:
//				ar = serverDAO.init();
//				serverView.view(ar);
//				break;
//			case 2:
//				serverDTO = serverDAO.searchByName(ar);
//				if(serverDTO != null) {
//					serverView.view(serverDTO);
//				}else {
//					serverView.view("찾는 학생이 없습니다.");
//				}
//				break;
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				break;
//			default:
//				break;
//			}
//		}
		
	}

}
