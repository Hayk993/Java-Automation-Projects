package homework.Task4;

import java.util.Scanner;

public class Task_4withFor {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int monthNumber = scaner.nextInt();
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Not a valid number, please enter 1-12 ");
            System.exit(1);
        }
        int month [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(month[monthNumber -1]);

    }
}
