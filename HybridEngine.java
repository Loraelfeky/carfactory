

public class HybridEngine extends BaseEngine {

    private GasEngine gas = new GasEngine();
    private ElectricEngine electric = new ElectricEngine();

    private boolean electricMode = true;

    public void start() {
        electricMode = true;
        electric.start();
        System.out.println("Hybrid engine started");
    }

    public void stop() {
        gas.stop();
        electric.stop();
        System.out.println("Hybrid engine stopped");
    }

    public void checkSpeed(int speed) {
        if (speed < 50) {
            electricMode = true;
            System.out.println("Electric engine working");
        } else {
            electricMode = false;
            System.out.println("Gas engine working");
        }
    }

    public void increase() {
        if (electricMode) {
            electric.increase();
        } else {
            gas.increase();
        }
    }

    public void decrease() {
        if (electricMode) {
            electric.decrease();
        } else {
            gas.decrease();
        }
    }
}