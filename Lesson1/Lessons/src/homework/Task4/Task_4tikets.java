package homework.Task4;

import java.util.Scanner;

public class Task_4tikets {
    public static void main(String[] args) {
        System.out.println("we have three typ of thikets 7000: 8000: 9000:");
        System.out.println("7000 is 3 place\n8000 is 2 place\n9000 is 1 place");

        System.out.println("and also we have discount if you are 65 + or 18 -");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter place number ");
        int placeMony = scanner.nextInt();
        if (placeMony > 3 || placeMony < 1) {
            System.out.println("please enter 1 , 2 or 3");
            System.exit(1);
        }
        System.out.print("please enter your age ");
        int age = scanner.nextInt();


        double place = switch (placeMony) {
            case 1 -> 9000;
            case 2 -> 8000;
            case 3 -> 7000;
            default -> 0;


        };

        if (age > 65 || age < 18) {
            double i = place - ((place * 20) / 100);
            System.out.println("you have a discount " + ((place * 20) / 100));
            System.out.println("your place money is " + i);

        } else {
            System.out.println("your place money is " + place);
        }


    }
}
