package com.mhj.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {

		// Client 접속 대기
		// 1번 : 점심 메뉴 중에서 하나를 랜덤하게 골라서 전송
		// 2번 : 저녁 메뉴 중에서 하나를 랜덤하게 골라서 전송
		// 3번 : 종료
		
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		
		String select = null;
		Random random = new Random();
		
		try {
			
			ss = new ServerSocket(8282);
			System.out.println("접속을 기다리는 중입니다...");
			sc = ss.accept();
			System.out.println("접속 완료!");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			//-------------------------------
			
			while(check) {
				
				select = br.readLine();
				
				if (select.equals("1")) {
					
//					String [] lunchArray = {"짜장면", "만두", "김밥", "떡볶이", "제육볶음"};
//					String lunch = lunchArray[random.nextInt(5)];
//					
//					bw.write(lunch);
//					bw.flush();	
					
					String [] lunch = {"짜장면", "만두", "김밥", "떡볶이", "제육볶음"};
					Calendar ca = Calendar.getInstance();
					random = new Random(ca.getTimeInMillis());
					int idx = random.nextInt(100)%5;
					
					String menu = lunch[idx];
					
					bw.write(menu);
					bw.flush();
					
				} else if (select.equals("2")) {
					
					String [] dinnerArray = {"스테이크", "마라탕", "파스타", "피자", "치킨"};
					String dinner = dinnerArray[random.nextInt(5)];
					
					bw.write(dinner);
					bw.flush();
					
				} else if (select.equals("3")) {
					
					System.out.println("프로그램을 종료합니다");
					check = false;
					break;
					
				} else {
					
					System.out.println("잘못 입력했습니다.\n다시 작성해 주세요.");
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
