package coffee;

public class DarkRoast extends Beverage{

	public DarkRoast(String size) {
		// TODO Auto-generated constructor stub
		description = "��ũ �ν�Ʈ";
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
	
}
