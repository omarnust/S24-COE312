import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws Exception{
		// Code to generate the input stream
		FileOutputStream out = new FileOutputStream("data.txt");
		DataOutputStream  dout = new DataOutputStream(out);
		dout.writeDouble(10);
		dout.writeDouble(20);
		dout.writeDouble(15);
		dout.writeDouble(12);
		dout.writeDouble(2);
		
		// Code to compute the average of the input stream
		Average av = new Average(new FileInputStream("data.txt"));
		System.out.println("Average: " + av.read());
		System.out.println("Average: " + av.read());
		System.out.println("Average: " + av.read());
		System.out.println("Average: " + av.read());
		System.out.println("Average: " + av.read());
	}
}
