package homework.Task11;

public class Student {
    String name;
    String age;
    double grade;

    Student(String name, String age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    void promote() {
        grade++;
    }
}
