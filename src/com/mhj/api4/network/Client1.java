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
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {

		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		
		//----------------------
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		ServerSocket ss = null;
		
		try {
			//객체 생성 시 서버 접속 시도
			socket = new Socket("localhost", 8282);
			System.out.println("Server 접속 성공");
			
			//0, 1
			os = socket.getOutputStream();
			//char
			ow = new OutputStreamWriter(os);
			//Stream
			bw = new BufferedWriter(ow);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while (true) {	
				
				System.out.println("Server로 보낼 메시지를 입력하세요.");
				String msg = scanner.next();
				
				bw.write(msg+"\r\n");
				bw.flush();
				
				if(msg.equalsIgnoreCase("q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}
				
				msg = br.readLine();
				
				if(msg.equalsIgnoreCase("q")) {
					System.out.println("상대방이 접속을 종료했습니다.");
					break;
				}
				
				System.out.println("Server : " + msg);
					
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
			} catch (Exception e) {
				
			}
			
			
			
		}
		
		

	}

}
