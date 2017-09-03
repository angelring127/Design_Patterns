package Display;

import WeatherData.Subject;

public class CurrentConditions implements Observer,DisplayElement {
	
	private float temp;
	private float humidity;
	private float pressure;
	private Subject wetherData;
	
	public CurrentConditions(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.wetherData = weatherData;
		this.wetherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}
}
