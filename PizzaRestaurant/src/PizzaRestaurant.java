
public class PizzaRestaurant {
	SimplePizzaFactory factory;
	
	public PizzaRestaurant(SimplePizzaFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
