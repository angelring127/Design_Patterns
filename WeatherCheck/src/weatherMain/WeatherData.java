package weatherMain;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	WeatherData(){
		observers = new ArrayList<Observer>();	//Observer ��ü���� �����ϱ� ���� ArrayList�� �߰��߽��ϴ�. �׸��� �����ڿ��� �� ��ü�� �����մϴ�.
	}
	float getTemperature() {return 0;}
	float getHumidity() {return 0;}
	float getPressure() {return 0;}
	/*
	 * ��� ��������
	 * ���ŵ� ������
	 * �˷��ֱ� ���� �޼ҵ�
	 */
	void measurementsChanged(){
		// ��� �����̼����κ��� ���ŵ� ����ġ�� ������ ������������ �˸��ϴ�.
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
		 * ���¿� ���ؼ� ��� ������������ �˷��ִ� �κ��̴�. �� observer �������̽��� �����ϴ�, �� update()�޼ҵ尡 �ִ� ��ü�� �̹Ƿ� 
		 * �ս��� �˷��� �� �ֽ��ϴ�. 
		 */
		
		for(int i = 0 ; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);		// ArrayList�� �ִ� observer �ҷ��� ������Ʈ 
			observer.update(temperature, humidity, pressure);
			
		}
		
	}
	@Override
	public void registerObserver(Observer o) {	// �������� ����� �ϸ� ��� �� �ڿ� �߰��ϱ⸸ �ϸ� �˴ϴ�.
		// TODO Auto-generated method stub
		observers.add(o);
		
	}
	
	@Override
	public void removeObserver(Observer o) {	// ����������, �������� Ż�� ��û�ϸ� ��Ͽ��� ���⸸ �ϸ� �˴ϴ�. 
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if( i >= 0){
			observers.remove(i);
		}
		
	}
}
