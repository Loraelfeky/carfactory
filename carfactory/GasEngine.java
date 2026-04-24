

public class GasEngine extends BaseEngine {

    public void start() {
        System.out.println("Gas engine started");
    }

    public void stop() {
        System.out.println("Gas engine stopped");
    }

    public void checkSpeed(int speed) {
        System.out.println("Car speed = " + speed);
    }
}