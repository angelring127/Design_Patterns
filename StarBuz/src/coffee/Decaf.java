package coffee;

public class Decaf extends Beverage{
	
	public Decaf(String size) {
		// TODO Auto-generated constructor stub
		description = "��ī����";
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
}
