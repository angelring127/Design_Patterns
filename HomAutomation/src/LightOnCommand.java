
public class LightOnCommand implements Command{
	Light light;
	// 커맨드 클래스	(주문서)
	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light =light;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		light.on();
	}
	


}
