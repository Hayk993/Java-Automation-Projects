package homework.task18.multifunctionalRobot;

public class VacuumCleaner implements Walker, Cleaner {
    @Override
    public void clean() {
        System.out.println("vacuum cleaner is cleaning ");
    }

    @Override
    public void walk() {
        System.out.println("vacuum cleaner is walking");
    }
}
