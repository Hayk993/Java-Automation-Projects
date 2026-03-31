package homework.task15;

public class MainForHumans {
    public static void main(String[] args) {
        Student s1 = new Student("Ani", 25, 100);
        Teacher t1 = new Teacher("Anush", 45, "Math");
        s1.displayInfo();
        System.out.println("-------------");
        t1.displayInfo();



    }
}
