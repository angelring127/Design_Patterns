package weatherMain;

public interface Observer {
	/*
	 * 모든 기상 구성요소에서 Observer인터페이스를 구현합니다. 
	 * 이 인터페이스는 주제 객체에서 옵저버한테 갱신된 정보를 전달할 수 있는 방법을 제공하죠
	 * 
	 */
	public void update(float temp, float humidity, float pressure);
}
