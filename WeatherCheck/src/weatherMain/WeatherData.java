package weatherMain;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	WeatherData(){
		observers = new ArrayList<Observer>();	//Observer 객체들을 저장하기 위해 ArrayList를 추가했습니다. 그리고 생성자에서 그 객체를 생성합니다.
	}
	float getTemperature() {return 0;}
	float getHumidity() {return 0;}
	float getPressure() {return 0;}
	/*
	 * 기상 관측값이
	 * 갱신될 떄마다
	 * 알려주기 위한 메소드
	 */
	void measurementsChanged(){
		// 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알립니다.
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		/*
		 * 상태에 대해서 모든 옵저버들한테 알려주는 부분이다. 두 observer 인터페이스를 구현하는, 즉 update()메소드가 있는 객체들 이므로 
		 * 손쉽게 알려줄 수 있습니다. 
		 */
		
		for(int i = 0 ; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);		// ArrayList에 있는 observer 불러와 업데이트 
			observer.update(temperature, humidity, pressure);
			
		}
		
	}
	@Override
	public void registerObserver(Observer o) {	// 옵저버가 등록을 하면 목록 맨 뒤에 추가하기만 하면 됩니다.
		// TODO Auto-generated method stub
		observers.add(o);
		
	}
	
	@Override
	public void removeObserver(Observer o) {	// 마찬가지로, 옵저버가 탈퇴를 신청하면 목록에서 빼기만 하면 됩니다. 
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if( i >= 0){
			observers.remove(i);
		}
		
	}
}
