import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Average {
	DataInputStream in;
	int count;
	double sum;
	
	Average(InputStream in){
		this.in = new DataInputStream(in);
		count = 0;
		sum = 0;
	}

	public double read() throws Exception{
		
		sum += in.readDouble();
		
		count += 1;
		return (double)sum/count;

	}

}
