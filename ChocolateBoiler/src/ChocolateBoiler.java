
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	
	private ChocolateBoiler() {
		// TODO Auto-generated constructor stub
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		
		return uniqueInstance;
	}
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()){
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
