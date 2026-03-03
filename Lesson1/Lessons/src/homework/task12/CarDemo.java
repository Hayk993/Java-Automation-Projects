package homework.task12;
import java.util.Scanner;
public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car("Mazda CX5",8000,50000);

        System.out.print("Enter km: ");
        int km = sc.nextInt();

        myCar.drive(km);
        System.out.println(myCar.canDrive());
        myCar.printStatus();
    }
}
