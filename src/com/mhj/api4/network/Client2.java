package com.mhj.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		
		// 1. 서버 접속 시도
		// 2. (1)점심 (2)저녁 (3)종료
		// 3. (1), (2), (3) 고르기
		// 1번 : 서버에서 점심 메뉴 중 하나를 보내줌, 출력
		// 2번 : 서버에서 저녁 메뉴 중 하나를 보내줌, 출력
		// 3번 : 종료
		
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			sc = new Socket("localhost", 8282);
			System.out.println("유저 접속");
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			//-----------------------------------
			
			while(check) {
				System.out.println("1. 점심 메뉴 추천");
				System.out.println("2. 저녁 메뉴 추천");
				System.out.println("3. 종료");
				
				String select = scanner.next();
				
				bw.write(select);
				bw.flush();
				
				if(select.equals("3")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}
				
				String menu = br.readLine();
				
				System.out.println(menu);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
