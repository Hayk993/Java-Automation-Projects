package homework.task15;

public class Manager extends Employee {
    int temaSize;
    @Override
    public void work() {
        super.work();
        System.out.println("I am manager");
    }
}
