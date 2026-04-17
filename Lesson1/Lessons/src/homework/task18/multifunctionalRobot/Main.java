package homework.task18.multifunctionalRobot;

public class Main {
    public static void performMorningRoutine(Cleaner c, Talker t){
    c.clean();
    t.speak();
    }
    public static void main(String[] args) {
        Android android = new Android();
        VacuumCleaner vacuum = new VacuumCleaner();
        Human human = new Human();

        performMorningRoutine(android, android);

        performMorningRoutine(vacuum, android);




    }
}
