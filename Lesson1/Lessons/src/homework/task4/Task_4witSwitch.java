package homework.task4;

import java.util.Scanner;

public class Task_4witSwitch {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int monthNumber = scaner.nextInt();
        String month = switch (monthNumber) {
            case 1 -> "January - 31 days";
            case 2 -> "February - 28 days";
            case 3 -> "March  -31 days";
            case 4 -> "April - 30 days";
            case 5 -> "May - 31 days";
            case 6 -> "Jun - 30 days";
            case 7 -> "July - 31 days";
            case 8 -> "August - 31 days";
            case 9 -> "September - 30 days";
            case 10 -> "October - 31 days";
            case 11 -> "November - 30 days";
            case 12 -> "December - 31 days";
            default -> "Not a valid number, please enter 1-12 ";
        };
        System.out.println(month);



    }
}
