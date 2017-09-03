package WeatherData;

import java.util.ArrayList;

import Display.Observer;

public class WeatherData implements Subject{
	private ArrayList <Observer>observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<observers.size();i++){
			Observer ob = observers.get(i);
			ob.update(temperature, humidity, pressure);
		}
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int indexO = observers.indexOf(o);
		if(indexO > 0){
			observers.remove(indexO);
		}
	}

}
