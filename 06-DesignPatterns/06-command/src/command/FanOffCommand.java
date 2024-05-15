package command;

public class FanOffCommand implements Command{
	Fan fan; // receiver object

	FanOffCommand(Fan fan) {
		this.fan = fan;
	}
	public void execute() {
			fan.off();
	}
	public void undo() {
		fan.on();
	}
}
