
public class Stereo {
	String location;
	private int volume = 0;
	public Stereo(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}
	public void on(){
		System.out.println("���׷��� ����");
	}
	public void off(){
		System.out.println("���׷��� ����");
	}
	public void setCd(){
		System.out.println("Cd ���� �Թ����� ");
	}
	public void setDvd(){
		System.out.println("ļ~ dvd �� �Թ���");
	}
	public void setRadio(){
		System.out.println("ġ������ ġ���� ���� ����");
	}
	public void setVolume(int size){
		System.out.println("------���� ��? �ٿ� ? up & down--------");
		if(this.volume>size){
			System.out.println("���� �ٿ� !!!");
			
		}else{
			System.out.println("���� ��!!!!!");
		}
		
		this.volume = size;
		
	}
	
}
