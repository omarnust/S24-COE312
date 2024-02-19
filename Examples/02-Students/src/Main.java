
public class Main {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
        Student undergraduate1 = new UndergraduateStudent();
        undergraduate1.setId(1);
        undergraduate1.setName("Ali");
        undergraduate1.setTuition();
        students[0] = undergraduate1;

        Student graduate1 = new GraduateStudent();
        graduate1.setId(2);
        graduate1.setName("Ahmad");
        graduate1.setTuition();
        students[1] = graduate1;

        Student graduate2 = new GraduateStudent();
        graduate2.setId(3);
        graduate2.setName("Muhammad");
        graduate2.setTuition();
        students[2] = graduate2;

        for(int i = 0; i < students.length; i++){
        	System.out.println(students[i]);
        }
	}

}
