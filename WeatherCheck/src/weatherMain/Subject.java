package weatherMain;

public interface Subject {
	public void registerObserver(Observer o);//	�� �� �޼ҵ忡�� ��� Observer�� ���ڸ� �޽��ϴ�.  
	public void removeObserver(Observer o);//	���� �������� ����ϰ� �����ϴ� ������ ����.
	public void notifyObserver();			//���� ��ü�� ���°� ����Ǿ��� �� ��� ������������ �˶�� ���� ȣ��Ǵ� �޼ҵ��Դϴ�.
}
