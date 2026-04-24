public class CarFactory {
    
    
    public static void main(String[] args) {

        CarFactory f = new CarFactory();

        Car c = f.makeCar("hybrid");

        c.start();

        c.accelerate();

        c.accelerate();

        c.accelerate();

        c.brake();

        c.brake();

        c.stop();

        System.out.println("-------");

        f.changeCarEngine(c, "gas");

        c.start();

        c.accelerate();

        c.stop();

    }

    public Car makeCar(String type) {

        if (type.equalsIgnoreCase("gas")) {
            return new Car(new GasEngine());
        } else if (type.equalsIgnoreCase("electric")) {
            return new Car(new ElectricEngine());
        } else {
            return new Car(new HybridEngine());
        }
    }

    public void changeCarEngine(Car car, String type) {

        if (type.equalsIgnoreCase("gas")) {
            car.changeEngine(new GasEngine());
        } else if (type.equalsIgnoreCase("electric")) {
            car.changeEngine(new ElectricEngine());
        } else {
            car.changeEngine(new HybridEngine());
        }
    }
}