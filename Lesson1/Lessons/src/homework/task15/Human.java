package homework.task15;

public class Human {
    private String name;
    private int age;
    Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}
