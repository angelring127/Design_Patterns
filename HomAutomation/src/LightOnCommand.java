
public class LightOnCommand implements Command{
	Light light;
	// Ŀ�ǵ� Ŭ����	(�ֹ���)
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
