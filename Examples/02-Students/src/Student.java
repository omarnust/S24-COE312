public abstract class Student {
    protected int id;
    protected String name;
    protected double tuition;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTuition() {
        return tuition;
    }
    
    public abstract void setTuition();
    
}