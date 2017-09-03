package Display;

public class StaticsDisplay implements Observer, DisplayElement{

	
	private float temp;
	private float humidity;
	private float pressure;
	
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
