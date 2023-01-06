package com.mhj.api1.strings.ex3;

public class WeatherView {
	
	//2개의 메서드, 이름 마음대로
	//1. 모든 날씨 정보 출력
	
	public void AllWeather(WeatherDTO [] datas) {
		for(int i=0; i<datas.length; i++) {
			this.OneWeather(datas[i]);
		}
	}
	
	//2. DTO 하나의 정보를 출력

	public void OneWeather(WeatherDTO weatherDTO) {
		System.out.println("----------------");
		System.out.println("City       : " + weatherDTO.getCity());
		System.out.println("Tempeature : " + weatherDTO.getTemperature());
		System.out.println("Status     : " + weatherDTO.getStatus());
		System.out.println("Microdust  : " + weatherDTO.getMicrodust());
	}
	
}
