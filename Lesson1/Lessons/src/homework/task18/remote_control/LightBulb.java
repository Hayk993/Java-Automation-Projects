package homework.task18.remote_control;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: is On");

    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: is Off");

    }
}
