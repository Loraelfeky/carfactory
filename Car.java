public class Car {

    private int speed = 0;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine changed");
    }

    public void start() {
        speed = 0;
        engine.start();
        System.out.println("Car started");
    }

    public void stop() {
        if (speed == 0) {
            engine.stop();
            System.out.println("Car stopped");
        } else {
            System.out.println("Stop the car first!");
        }
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            System.out.println("Speed = " + speed);
            engine.checkSpeed(speed);
            engine.increase();
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            System.out.println("Speed = " + speed);
            engine.checkSpeed(speed);
            engine.decrease();
        }
    }
}