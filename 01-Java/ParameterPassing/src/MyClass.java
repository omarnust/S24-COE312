
import java.util.Arrays;

// Java is strictly pass by value

public class MyClass {
	
	int x = 1;
	
	// constructors
	MyClass(){
		
	}
	MyClass(int x){
		this.x = x;
	}
	
	/* pass by value: java makes copy of the variable being passed
	 * in the method and then does the manipulation. So changes are not
	 * reflected in the main method. This happens for all primitive data
	 * types and Strings.
	*/
	public void method1(int num, String txt) {
		num += 1;
		txt += "-> ";
		System.out.println(txt + Integer.toString(num));
	}
		
	/* pass by reference: All non-primitive data types are always reference
	 * So when we pass object references to methods, java will still make a copy
	 * of the reference but the copy points to the same memory. so changes
	 * are reflected back 
	 * */
	public void method2(int[] nums) {
		for (int i=0; i<nums.length; i++) {
			nums[i] *= 2;
		}
		System.out.println(Arrays.toString(nums));
	}	
	// pass by reference: in this case, nums points to some other memory location
	// inside the function so changes are not reflected back
	public void method3(int[] nums) {
		nums = new int[5];
		for (int i=0; i<nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
		
	public void method4(MyClass pp) {
		pp.x += 1;
	}
	
	public void run() {
			
		int num = 5;
		String txt = "Number is ";
			
		// Pass by value
		method1(num, txt);
		System.out.println(txt + Integer.toString(num));
			
		// Pass by reference
		int[] nums = {1,2,3,4,5};
		method2(nums);
		System.out.println(Arrays.toString(nums));
			
		int[] nums2 = {1,2,3,4,5};
		method3(nums2);
		System.out.println(Arrays.toString(nums2));
				
	}
}