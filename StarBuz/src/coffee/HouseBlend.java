package coffee;

public class HouseBlend extends Beverage{
	
	public HouseBlend(String size) {
		// TODO Auto-generated constructor stub
		description = "�Ͽ콺 �귻�� Ŀ��";
		setSize(size);
	}	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
	
}
