
public class Stereo {
	String location;
	private int volume = 0;
	public Stereo(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}
	public void on(){
		System.out.println("½ºÅ×·¹¿À ÄÑÁü");
	}
	public void off(){
		System.out.println("½ºÅ×·¹¿À ²¨Áü");
	}
	public void setCd(){
		System.out.println("Cd µé¾î°£´Ù ÀÔ¹ú·Á¶ó ");
	}
	public void setDvd(){
		System.out.println("Ä¼~ dvd µé¾î°¨ ÀÔ¹ú·Á");
	}
	public void setRadio(){
		System.out.println("Ä¡ÁöÁöÁ÷ Ä¡ÁöÁ÷ ¶óµð¿À ÄÑÁü");
	}
	public void setVolume(int size){
		System.out.println("------º¼·ý ¾÷? ´Ù¿î ? up & down--------");
		if(this.volume>size){
			System.out.println("º¼·ý ´Ù¿î !!!");
			
		}else{
			System.out.println("º¼·ý ¾÷!!!!!");
		}
		
		this.volume = size;
		
	}
	
}
