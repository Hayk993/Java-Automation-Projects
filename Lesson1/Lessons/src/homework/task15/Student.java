package homework.task15;

public class Student extends Human {
    private int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
