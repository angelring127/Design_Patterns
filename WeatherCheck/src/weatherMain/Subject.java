package weatherMain;

public interface Subject {
	public void registerObserver(Observer o);//	이 두 메소드에서 모두 Observer를 인자를 받습니다.  
	public void removeObserver(Observer o);//	각각 옵저버를 등록하고 제거하는 역할을 하죠.
	public void notifyObserver();			//주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알라기 위해 호출되는 메소드입니다.
}
