
public class RemoteCotrol {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteCotrol() {
		// TODO Auto-generated constructor stub
		//생성자 에서는 각 on,off 배열의 인스턴스를 만들고 초기화 만 한다.
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		
		for(int i=0;i<7;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].excute();
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].excute();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n--------- Remote Control ---------\n");
		for (int i = 0; i < onCommands.length; i++){
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "     " 
								+ offCommands[i].getClass().getName() + "\n" );
		}
		return stringBuff.toString();
	}
	
}
