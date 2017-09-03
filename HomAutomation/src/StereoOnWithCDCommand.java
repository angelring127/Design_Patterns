
public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
		stereo.setVolume(0);
		
	}
}
