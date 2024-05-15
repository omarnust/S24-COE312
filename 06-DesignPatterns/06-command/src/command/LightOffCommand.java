package command;

public class LightOffCommand implements Command{
	Light light; // receiver object

	LightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
			light.off();
	}
	public void undo() {
		light.on();
	}
}
