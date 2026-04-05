package homework.Task5;

import java.util.Scanner;

public class AdvancedMonthTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber ;
        while (true) {
            System.out.print("please enter month number (1-12): ");
            monthNumber = scanner.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) {
                break; // valid number, exit loop
            } else {
                System.out.println("Invalid number! Please enter a number between 1 and 12.");
            }
        }

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
        scanner.close();



    }
}


