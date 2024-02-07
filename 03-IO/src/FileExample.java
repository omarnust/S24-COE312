
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
	public static void run() {
		
		try {
			FileOutputStream fout = new FileOutputStream("textout.txt");
					
			fout.write(65); // 65 is "A" in ascii
			fout.close();
			System.out.println("Success...");
			
		}catch(IOException e) {
			System.err.println("Error");
		}
		
	}

}
