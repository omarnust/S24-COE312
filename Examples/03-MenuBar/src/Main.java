import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		DrawShapes shapes = new DrawShapes(new BlackColor());
		
		Command rectangle = new Rectangle(shapes);
		Command circle = new Circle(shapes);
		
		Menubar menubar = new Menubar();
		menubar.addCommand(circle);
		menubar.addCommand(rectangle);
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int cmd = scanner.nextInt();
				menubar.executeCommand(cmd);
			}else {
				String line = scanner.nextLine();
				switch (line) {
					case "undo":
						menubar.undo();
						break;
					case "red":
						shapes.setColor(new RedColor());
						break;
					case "black":	
						shapes.setColor(new BlackColor());
						break;
				}
			}
		}
		scanner.close();
	}

}
