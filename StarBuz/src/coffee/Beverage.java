package coffee;

public abstract class Beverage {
	public static final int TALL = 1;
	public static final int GRANDE = 2;
	public static final int VENT = 3;
	
	String description = "제목 없음";
	int size = 1;	// 디폴트 값으로 톨 설정
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(String size){
		switch(size){
		case "Tall":
			this.size = 1;
			break;
		case "Grande":
			this.size = 2;
			break;
		case "Venti":
			this.size = 3;
		default:
			break;
		}
	}
	
}
