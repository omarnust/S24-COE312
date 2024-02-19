/*
 * Develop a Java class hierarchy that can help keep track of 
 * music tracks. The classes must incorporate all appropriate 
 * properties of a music track. 
 * 
 * You must run and provide output on the following program 
 * (without any changes to the program).  
 * You are not allowed to make any changes to this program. 
 * Expected Output:
 * title:Comfortably Numb 
 * album:The Wall 
 * length:6.21 minutes 
 * released in:1979
 * band members: 
 * Roger Waters 
 * Bob Klos 
 * Nick Mason 
 * David Gilmore
 * average age:76.75 years
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] ms =
			{new Member("Roger Waters", 77), 
			new Member("Bob Klos",76),
			new Member("Nick Mason",77),
			new Member("David Gilmore", 77)};
		
		Band b = new Band("Pink Floyd",ms);
		Track t1 = new Track(/*title(String)*/"Comfortably Numb", 
				             /*Band*/ b, /*name of the album*/"The Wall", 
				             /*year(int)*/ 1979, /*length(double)*/6.21);
		System.out.println(t1);
	}

}
