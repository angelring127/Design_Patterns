
public class SimpleRemoteControl {
	Command slot;		//커맨드를 집어넣을 슬롯이 하나 밖에 없습니다. 이걸 가지고 장비를 제어 할 수 있습니다.  
	// 인보커 객체	(웨이트리스)
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void setCommand(Command command) {
		//슬롯을 가지고 제아할 명령을 설정하기 위한 메소드
		slot = command;
	}
	
	public void buttonWasPressed(){
		//버튼이 눌려지면 이 메소드가 호출됩니다. 
		slot.excute();
	}
}
