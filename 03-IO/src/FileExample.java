
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

//This class contains static methods to illustrate FileOutputStream and FileInputSteam methods
public class FileExample {
	public static void run() {
		
		try {
			
			FileOutputStream fout = new FileOutputStream("textout.txt");
					
			fout.write(65); // 65 is "A" in ascii
			
			// not flushing because close will do it. 
			
			fout.close();
			System.out.println("Success...");
			
		}catch(IOException e) {
			System.err.println("Error");
		}
		
	}
	
	public static void run2() {
		try {
			FileOutputStream fout = new FileOutputStream("textout.txt");
			String s = "Welcome to COE312";
			byte[] b = s.getBytes();
			fout.write(b);
			
			fout.close();
			System.out.println("Success...");
			
		}catch(IOException e) {
			System.err.println("Error in function run2");
		}
	}
	
	public static void run3() {
		try {
			FileInputStream fin = new FileInputStream("textout.txt");
			int i = fin.read();
			System.out.println((char)i);
			
			fin.close();
			
			
		}catch(IOException e){
			System.err.println("Error in function run3");
		}
	}
	public static void run4() {
		try {
			FileInputStream fin = new FileInputStream("textout.txt");
			
			/*
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			*/
			
			int i = 0;
			while (fin.available() > 0) {
				i = fin.read();
				System.out.print((char)i);
			}
			fin.close();
			
			
		}catch(IOException e){
			System.err.println("Error in function run4");
		}
	}
	
	
	public static void run5(){
		try {
			FileInputStream fin = new FileInputStream("textout.txt");
			int len = fin.available();
			byte[] b = new byte[len];
			
			int i = fin.read(b);
			
			for (byte bi: b) {
				System.out.print((char) bi); 
			}
			System.out.print("\n");
			for (int j =0; j<b.length; j++) {
				System.out.print((char) b[j]); 
			}
			System.out.print("\n");
			System.out.println(Arrays.toString(b));
			
			fin.close();
			
			
		}catch(IOException e) {
			System.err.println("Error in function run5");
		}
	}
	

}
