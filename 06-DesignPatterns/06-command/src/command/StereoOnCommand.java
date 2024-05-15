package command;

public class StereoOnCommand implements Command {
	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo){
		this.stereo = stereo;
	}
	public void execute() {
		stereo.on();
		stereo.settrack("Wish you were here");
		stereo.setvolume(1);
	}
	public void undo() {
		stereo.off();
	}
}
