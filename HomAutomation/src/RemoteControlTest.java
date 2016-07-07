
public class RemoteControlTest {
	public static void main(String[] args) {
			SimpleRemoteControl srControl = new SimpleRemoteControl();//웨이트리스
			Light light = new Light();
			LightOnCommand lightOnCmd = new LightOnCommand(light);//주문서
		
			srControl.setCommand(lightOnCmd);//takeOrder()
			srControl.buttonWasPressed();
		
	
	}
}
