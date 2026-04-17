package homework.task18.remote_control;

public class Main {
    public static void main(String[] args) {
        LightBulb l = new LightBulb();
        Fan f = new Fan();
        RemoteControl rm = new RemoteControl(l);
        rm.SwitchOn();
        rm.SwitchOn();
        rm.SwitchOn();
        RemoteControl fan = new RemoteControl(f);
        fan.SwitchOn();
        fan.SwitchOn();
        fan.SwitchOn();

    }

}
