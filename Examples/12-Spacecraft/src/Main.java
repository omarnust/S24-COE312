
public class Main {
    public static void main(String[] args) {
        
        Spacecraft spacecraft = new Spacecraft();

        // Simulating sensor data every second for 20 seconds
        for (int i = 0; i < 10; i++) {
            new Sensor().registerObserver(spacecraft);
        }
    }
}