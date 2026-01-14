package homework.Task4;

import java.util.Scanner;

public class Task_4busTikets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tikitPrice = 200;
        System.out.print("please enter your age ");
        double age = scanner.nextDouble();
        if (age > 65 || age < 18) {
            System.out.println("your discount  is " + ((tikitPrice * 20) / 100));
            System.out.println("your place  money is " + (tikitPrice - ((tikitPrice * 20) / 100)));
            System.exit(651);

        } else if (age < 65 || age > 18) {
            System.out.print("please enter number of baby ");
            int numberOfBabs = scanner.nextInt();
            if (numberOfBabs == 0) {
                System.out.println("your ticket price is " + tikitPrice);
                System.exit(1);
            }
            switch (numberOfBabs) {
                case 1-> System.out.println("your place  money is " + tikitPrice);
                case 2-> System.out.println("your place  money is " + tikitPrice);
                case 3 -> {
                    System.out.println("your discount  is " + ((tikitPrice * 25) / 100));
                    System.out.println("your place  money is " + (tikitPrice - ((tikitPrice * 15) / 100)));
                }
                case 4 -> {
                    System.out.println("your discount  is " + ((tikitPrice * 25) / 100));
                    System.out.println("your place  money is " + (tikitPrice - ((tikitPrice * 25) / 100)));
                }
                case 5 -> {
                    System.out.println("your discount  is " + ((tikitPrice * 35) / 100));
                    System.out.println("your place  money is " + (tikitPrice - ((tikitPrice * 35) / 100)));

                }
                default -> {
                    System.out.println("your discount  is " + ((tikitPrice * 45) / 100));
                    System.out.println("your place  money is " + (tikitPrice - ((tikitPrice * 45) / 100)));
                }

            }

        }

    }


}
