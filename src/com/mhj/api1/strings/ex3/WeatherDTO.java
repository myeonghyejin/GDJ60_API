package com.mhj.api1.strings.ex3;

public class WeatherDTO {
	
	private String city;
	private int temperature;
	private String status;
	private int microdust;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMicrodust() {
		return microdust;
	}
	public void setMicrodust(int microdust) {
		this.microdust = microdust;
	}
	
}