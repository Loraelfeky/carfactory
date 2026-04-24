


public abstract class BaseEngine implements Engine {

    protected int speed = 0;

    public void increase() {
        speed++;
        System.out.println("engine speed = " + speed);
    }

    public void decrease() {
        if (speed > 0) {
            speed--;
        }
        System.out.println("engine speed = " + speed);
    }
}