public class Rectangle implements Command {
	DrawShapes drafter;
	public Rectangle(DrawShapes shapes){
		this.drafter = shapes;
	}
	public void execute(){
		drafter.drawRectangle();
	}
	public void undo() {
		drafter.EraseRectangle();
	}
}