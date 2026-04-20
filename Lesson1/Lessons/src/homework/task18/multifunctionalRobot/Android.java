package homework.task18.multifunctionalRobot;

public class Android implements Cleaner, Talker, Walker {
    @Override
    public void clean() {
        System.out.println("Android is cleaning ");
    }

    @Override
    public void speak() {
        System.out.println("Android is speaking ");
    }

    @Override
    public void walk() {
        System.out.println("Android is walking ");
    }
}
