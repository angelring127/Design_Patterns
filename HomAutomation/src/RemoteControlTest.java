
public class RemoteControlTest {
	public static void main(String[] args) {
			SimpleRemoteControl srControl = new SimpleRemoteControl();//����Ʈ����
			Light light = new Light();
			LightOnCommand lightOnCmd = new LightOnCommand(light);//�ֹ���
		
			srControl.setCommand(lightOnCmd);//takeOrder()
			srControl.buttonWasPressed();
		
	
	}
}
