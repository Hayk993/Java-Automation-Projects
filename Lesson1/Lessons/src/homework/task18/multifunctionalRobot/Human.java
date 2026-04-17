package homework.task18.multifunctionalRobot;

public class Human implements Walker, Talker {
    @Override
    public void walk() {
        System.out.println("Human is walking:");

    }

    @Override
    public void speak() {
        System.out.println("Human is speaking:");

    }
}
