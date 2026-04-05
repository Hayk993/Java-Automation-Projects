package homework.Task6;

import java.util.Scanner;

public class PalindromeEx {
    public static void main(String[] args) {
        //Գրեք ծրագիր, որը կստանա ցանկացած 0 նիշ չպարունակող ամբողջ թիվ, ու կտպի արդյոք տվյալ թիվը պոլինդրոմա թե չէ
        // Թիվը կոչվումա պոլինդրոմ, եթե ձախից աջ ու աջից ձախ կարդալուց նույն թիվնա ստացում, օրինակ 43934։
        // Բարդ չի ընդհանրապես, բայց կարողա լինի բազմաքայլ լուծում։
        // Մի ենթադրեք, որ ամեն մի խնդիր պիտի մի ցիկլով լուծվի։
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the number");
        while (true) {
            int number = scanner.nextInt();
            int notZero = number;
            int poltemp = number;
            int revers = 0;


            while (notZero != 0) {
                if (notZero % 10 != 0) {
                    notZero /= 10;
                } else if (notZero == 0) {
                    System.out.println("the number must not be zero");
                    break;

                } else {
                    System.out.println("there is the number 0");
                    break;
                }
            }
            while (number != 0) {
                int digit = number % 10;
                revers = revers * 10 + digit;
                number /= 10;
            }
            if (poltemp == revers && poltemp != 0) {
                System.out.println("the number is palindromic");
            } else {
                System.out.println("the number is not palindromic");
            }
        }


    }
}
