package homework.task18.remote_control;

public class RemoteControl {
    private boolean isTurnOn = false;
    private Switchable sw;

    RemoteControl(Switchable sw) {
        this.sw = sw;
    }

    public void switchOn() {
        if (!isTurnOn) {
            sw.turnOn();
            isTurnOn = true;
            return;
        }
        sw.turnOff();
        isTurnOn = false;
    }

}





