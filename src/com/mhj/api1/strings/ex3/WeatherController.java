package com.mhj.api1.strings.ex3;

import java.awt.Window;
import java.util.Scanner;

public class WeatherController {

	//start
	//1. 날씨 정보 초기화
	//	 초기화가 완료되었습니다.
	//2. 전국 날씨 정보
	//3. 지역 날씨 검색
	//	 도시 정보가 없습니다.
	//4. 지역 날씨 추가
	//	 	
	//5. 지역 날씨 삭제
	//
	//6. 종       료	
	
	private Scanner sc;
	private WeatherData weatherData;
	private WeatherView weatherView;
	private WeatherInput weatherInput;
	private WeatherDTO [] weatherDTOs = null;
	
	public WeatherController() {
		this.sc = new Scanner(System.in);
		this.weatherData = new WeatherData();
		this.weatherInput = new WeatherInput();
		this.weatherView = new WeatherView();
		
	}
	
	public void Start() {
		
		boolean check = true;
		
		while (check) {
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 전국 날씨 정보");
			System.out.println("3. 지역 날씨 검색");
			System.out.println("4. 지역 날씨 추가");
			System.out.println("5. 지역 날씨 삭제");
			System.out.println("6. 종료");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				weatherDTOs = weatherData.init();
				System.out.println("초기화가 완료되었습니다.");
				break;
			case 2:		
				weatherView.AllWeather(weatherDTOs);
				break;
			case 3:
				break;
			case 4:
				this.weatherDTOs = weatherInput.add(weatherDTOs);
				break;
			case 5:
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				check = false;
			default:
				System.out.println("오류입니다. 다시 선택하세요.");
				break;
			}
			
		}
		
		
		
	}

}
