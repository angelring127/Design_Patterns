package display;

import weatherMain.DisplayElement;
import weatherMain.Observer;

public class ThirdPartyDisplay implements DisplayElement, Observer{
	public ThirdPartyDisplay() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		/*
		 * 측정값을 바탕으로 다른 내용 표시
		 */
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}

}
