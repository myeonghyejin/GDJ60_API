package com.mhj.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	
	private Scanner sc;
	
	public WeatherInput() {
		this.sc = new Scanner(System.in);
	}
	
	//3. 지역 날씨 검색
	//search
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
	//찾은 DTO를 리턴, 없으면 null 리턴

	public void search(WeatherDTO [] weatherDTOs) {
		System.out.println("검색할 도시명을 입력하세요.");
		String search = sc.next().toUpperCase();
		
		WeatherDTO weatherDTO = new WeatherDTO();
		
		for (int i=0; i<weatherDTOs.length; i++) {
			if (search.equals(weatherDTOs[i].getCity().toUpperCase())) {
				weatherDTO = weatherDTOs[i];
			}
		}
	}
	
	//4. 지역 날씨 추가
	//add
	//배열을 받고, 키보드로부터 정보들을 입력 받음
	//배열을 추가하고 배열을 리턴
	
	public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		
		System.out.println("추가할 지역명을 입력하세요.");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요.");
		weatherDTO.setTemperature(sc.next());
		System.out.println("날씨를 입력하세요.");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 농도를 입력하세요.");
		weatherDTO.setMicrodust(sc.next());
		
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length+1];
		
		for(int i=0;i<weatherDTOs.length;i++) {
			newInfo[i] = weatherDTOs[i];
		}
		
		newInfo[weatherDTOs.length] = weatherDTO;
		return newInfo;
	}
	
	//5. 지역 날씨 삭제
	//remove
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴
	
	public WeatherDTO [] remove (WeatherDTO [] weatherDTOs) {
		
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length-1];		
		System.out.println("삭제할 도시명을 입력하세요.");
		String remove = sc.next().toUpperCase();
		int idx = 0;
		for (int i=0; i<weatherDTOs.length; i++) {
			if(remove.equals(weatherDTOs[i].getCity().toUpperCase())) {
				continue;				
			}
			newInfo[idx] = weatherDTOs[i];
			idx++;
		}
		
	}

	
}
