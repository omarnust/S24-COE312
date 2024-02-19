public class GraduateStudent extends Student{
    
    public void setTuition() {
        this.tuition = 4000;
    }
    
    @Override
    public String toString() {
    	return "Graduate student: \nName: " + name +
               "\nID: " + id + 
               "\nTuiton: AED" + tuition + "\n";
    }
}