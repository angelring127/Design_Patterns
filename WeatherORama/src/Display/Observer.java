package Display;

public interface Observer {
	// 옵저버 인터페이스
	abstract void update(float temp, float humidity, float pressure); // 값이 업데이트 되었을때 활성
}
