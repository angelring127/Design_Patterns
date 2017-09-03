package WeatherData;

import Display.Observer;

public interface Subject {
	abstract void registerObserver(Observer o);			//������ ���
	abstract void removeObserver(Observer o);			//������ ���� 
	abstract void notifyObserver();						//��ü��ü�� ���°� ����Ǿ��� �� ��� ������������ �˸������� 
														//ȣ��Ǵ� �޼ҵ�
}
