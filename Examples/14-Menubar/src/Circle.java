public class Circle implements Command {
	DrawShapes drafter;
	 
	public Circle(DrawShapes drafter){
		this.drafter = drafter;
	}
	public void execute(){
		drafter.drawCircle();
	}
	public void undo() {
		drafter.EraseCircle();
	}
}
