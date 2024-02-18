import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

//This class contains static methods to illustrate BufferOutputStream 
// and BufferInputSteam methods

public class BufferExample {
	
	public static void run1() {
		try {
			FileOutputStream fout = new FileOutputStream("output.txt");
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String txt = "Welcome to the class";
			bout.write(txt.getBytes());
			bout.close();
			System.out.println("Success ...");
			
		}catch(IOException e) {
			System.err.println(e);
		}
	}
	
	public static void run2() {
		try {
			FileInputStream fin = new FileInputStream("testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read()) != -1) {
				System.out.println((char)i);
			}
			fin.close();
			bin.close();
			System.out.println("Success ...");
		
		}catch(IOException e) {
			System.err.println(e);
		}
	}
	
}
