package coffee;

public class DarkRoast extends Beverage{

	public DarkRoast(String size) {
		// TODO Auto-generated constructor stub
		description = "다크 로스트";
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
	
}
