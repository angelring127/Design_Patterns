package addtion;

import coffee.Beverage;

public class SteamMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", ���� ��ũ";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if(getSize() == Beverage.TALL){
			cost += .15;
		} else if (getSize() == Beverage.GRANDE){
			cost += .20;
		} else if (getSize() == Beverage.VENT){
			cost += .25;
		}
		return cost;
	}
}
