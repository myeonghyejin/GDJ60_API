package com.mhj.api1.strings.ex3;

public class WeatherDTO {
	
	private String city;
	private String temperature;
	private String status;
	private String microdust;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMicrodust() {
		return microdust;
	}
	public void setMicrodust(String microdust) {
		this.microdust = microdust;
	}
	
}