package addtion;

import coffee.Beverage;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", µŒ¿Ø";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if(getSize() == Beverage.TALL){
			cost += .20;
		} else if (getSize() == Beverage.GRANDE){
			cost += .25;
		} else if (getSize() == Beverage.VENT){
			cost += .30;
		}
		return cost;
	}
}
