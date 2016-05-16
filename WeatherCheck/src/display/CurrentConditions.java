package display;

import weatherMain.DisplayElement;
import weatherMain.Observer;
import weatherMain.Subject;

public class CurrentConditions implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	/*
	 * 이 디스플레이 항목에서는 WeatehrData 객체로부터얻은 현재 측정값들을 보여줍니다.
	 */
	public CurrentConditions(Subject weatherData) {	
		// 생성자에 weatherData라는 주제 객체가 전달되며 그 객체를 써서 디스플레이를 옵저버로 등록
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humdity");
		
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
		this.temperature = temp;
		this.humidity  = humidity;
		display();
		
	}
	
	
	
	
}
