package com.mhj.api5.thread;

public class ThreadMain1 {

	public static void main(String[] args) {

		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		
		tt1.start();	//OS에게 위임
		tt2.start();	//OS에게 위임
		
		//runable
		Thread tr1 = new Thread(tt3);
		
		tr1.start();
		tr2.start();

	}

}
