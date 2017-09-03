
public class StereoOffWithCDCommand implements Command{
	Stereo stereo;
	public StereoOffWithCDCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		stereo.setVolume(0);
		stereo.off();
		
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setVolume(11);
	}
}
