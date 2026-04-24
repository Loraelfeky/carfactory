

public class ElectricEngine extends BaseEngine {

    public void start() {
        System.out.println("Electric engine started");
    }

    public void stop() {
        System.out.println("Electric engine stopped");
    }

    public void checkSpeed(int speed) {
        System.out.println("Car speed = " + speed);
    }
}