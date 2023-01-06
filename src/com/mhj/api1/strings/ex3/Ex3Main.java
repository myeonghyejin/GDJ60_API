package com.mhj.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");	
		
//		WeatherController weatherController = new WeatherController();
//		weatherController.Start();
		
		new WeatherController().Start();
		//한 번만 쓰고 말 애들은 이렇게 써도 됨
		
		System.out.println("finish");

	}

}