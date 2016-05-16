package display;

import weatherMain.DisplayElement;
import weatherMain.Observer;
import weatherMain.WeatherData;

public class StatisticsDisplay implements Observer , DisplayElement{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	public StatisticsDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		// 평균, 최저 , 최고치 표시
		
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		tempSum += temp;
		numReadings++;
		
		if(temp > maxTemp){
			maxTemp = temp;
		}
		
		if(temp < minTemp){
			minTemp = temp;
		}
		
		display();
		
		
	}

}
