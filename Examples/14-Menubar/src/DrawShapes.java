public class DrawShapes {
	ColorStrategy color;
	
	DrawShapes(ColorStrategy color){
		this.color = color;
	}	
	
	public void drawRectangle(){
		System.out.println("Drawing " +color.getColor()+ " Rectangle");
	 }
	public void drawCircle(){
		System.out.println("Drawing " +color.getColor()+ " Circle");
	}
	public void EraseRectangle(){
		System.out.println("Undo Rectangle");
	}
	public void EraseCircle(){
		System.out.println("Undo Circle");
	}
	
	public void setColor(ColorStrategy color) {
		System.out.println("Changing color");
		this.color = color;
	}
}