package weatherMain;

public interface Observer {
	/*
	 * ��� ��� ������ҿ��� Observer�������̽��� �����մϴ�. 
	 * �� �������̽��� ���� ��ü���� ���������� ���ŵ� ������ ������ �� �ִ� ����� ��������
	 * 
	 */
	public void update(float temp, float humidity, float pressure);
}
