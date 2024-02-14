import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample {
	
	public static void run1() {
		try {
			FileOutputStream fout = new FileOutputStream("dataout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeFloat(3.14F);
			dout.writeFloat(-443.2342114F);
			dout.writeInt(123412);
			
			dout.close();
			System.out.println("Success...");
			
		}catch(IOException e) {
			System.err.println("Error");
		}
	}
	
}
