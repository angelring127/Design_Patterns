package coffee;

public class Espresso extends Beverage {

	public Espresso(String size) {
		// TODO Auto-generated constructor stub
		description = "����������";
		setSize(size);
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
