package command;

public class FanOnCommand implements Command{
	Fan fan; // receiver object

	FanOnCommand(Fan fan) {
		this.fan = fan;
	}
	public void execute() {
			fan.on();
	}
	public void undo() {
		fan.off();
	}
}
