package homework.task15;

public class Teacher extends Human {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
