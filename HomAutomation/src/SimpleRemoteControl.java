
public class SimpleRemoteControl {
	Command slot;		//Ŀ�ǵ带 ������� ������ �ϳ� �ۿ� �����ϴ�. �̰� ������ ��� ���� �� �� �ֽ��ϴ�.  
	// �κ�Ŀ ��ü	(����Ʈ����)
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void setCommand(Command command) {
		//������ ������ ������ ����� �����ϱ� ���� �޼ҵ�
		slot = command;
	}
	
	public void buttonWasPressed(){
		//��ư�� �������� �� �޼ҵ尡 ȣ��˴ϴ�. 
		slot.excute();
	}
}
