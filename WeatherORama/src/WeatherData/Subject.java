package WeatherData;

import Display.Observer;

public interface Subject {
	abstract void registerObserver(Observer o);			//옵저버 등록
	abstract void removeObserver(Observer o);			//옵저버 해제 
	abstract void notifyObserver();						//주체객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기위한 
														//호출되는 메소드
}
