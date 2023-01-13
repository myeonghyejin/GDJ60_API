package com.mhj.api4.network.servers;

public class ServerMain {

	public static void main(String[] args) {
		//프로그램 시작, Test 용도
		
		ServerMenu serverMenu = new ServerMenu();
		
		try {
			serverMenu.menu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
