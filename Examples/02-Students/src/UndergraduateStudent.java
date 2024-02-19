public class UndergraduateStudent extends Student{
    
    public void setTuition() {
        this.tuition = 2000;
    }
    
    @Override
    public String toString() {
    	return "Undergraduate student: \nName: " + name +
               "\nID: " + id + 
               "\nTuiton: AED" + tuition + "\n";
    }
}