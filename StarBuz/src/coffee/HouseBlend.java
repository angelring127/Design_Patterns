package coffee;

public class HouseBlend extends Beverage{
	
	public HouseBlend(String size) {
		// TODO Auto-generated constructor stub
		description = "하우스 브렌드 커피";
		setSize(size);
	}	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
	
}
