package homework.task18.remote_control;

public class Main {
    public static void main(String[] args) {
        LightBulb l = new LightBulb();
        Fan f = new Fan();
        RemoteControl rm = new RemoteControl(l);
        rm.switchOn();
        rm.switchOn();
        rm.switchOn();
        RemoteControl fan = new RemoteControl(f);

    }

}
