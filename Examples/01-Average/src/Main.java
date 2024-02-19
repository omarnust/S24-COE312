/*
 * Write a class called Average that can read from any input stream and computes the 
 * average of the stream seen so far. You can assume that the input stream consists of 
 * data type double stored in a machine independent way. The class Average has one 
 * function called read() which reads the next double number and returns the average of 
 * the stream seen so far. 

 * You must run and provide output on the following program (without any changes to the program).  
 * You are not allowed to make any changes to this program. 

 */

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
