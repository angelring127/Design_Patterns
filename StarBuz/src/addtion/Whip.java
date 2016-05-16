package addtion;

import coffee.Beverage;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", »÷«Œ ≈©∏≤";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if(getSize() == Beverage.TALL){
			cost += .10;
		} else if (getSize() == Beverage.GRANDE){
			cost += .15;
		} else if (getSize() == Beverage.VENT){
			cost += .20;
		}
		return cost;
	}
}
