package coffee;

public class Decaf extends Beverage{
	
	public Decaf(String size) {
		// TODO Auto-generated constructor stub
		description = "디카페인";
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
}
