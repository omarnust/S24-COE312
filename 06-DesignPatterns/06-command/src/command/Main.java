package command;

public class Main {
	public static void main(String[] args) {
		// create object to be acted upon
		Light l1 = new Light();
		Fan f1 = new Fan();
		Stereo s1 = new Stereo();
		
		// create the commands
		LightOnCommand lon = new LightOnCommand(l1);
		LightOffCommand loff = new LightOffCommand(l1);
		FanOnCommand fon = new FanOnCommand(f1);
		FanOffCommand foff = new FanOffCommand(f1);
		StereoOnCommand son = new StereoOnCommand(s1);
		StereoOffCommand soff = new StereoOffCommand(s1);

		// create the panel
		Command[] cmds = { lon, loff, fon, foff, son, soff};
		ControlPanel p = new ControlPanel(cmds);

		// operate the light and fan
		p.buttonWasPressed(0);
		p.buttonWasPressed(1);
		p.buttonWasPressed(2);
		p.undo();
		p.buttonWasPressed(3);
		p.buttonWasPressed(4);

	}
}
