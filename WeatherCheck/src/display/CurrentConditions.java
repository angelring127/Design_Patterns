package display;

import weatherMain.DisplayElement;
import weatherMain.Observer;
import weatherMain.Subject;

public class CurrentConditions implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	/*
	 * �� ���÷��� �׸񿡼��� WeatehrData ��ü�κ��;��� ���� ���������� �����ݴϴ�.
	 */
	public CurrentConditions(Subject weatherData) {	
		// �����ڿ� weatherData��� ���� ��ü�� ���޵Ǹ� �� ��ü�� �Ἥ ���÷��̸� �������� ���
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
