package repit;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }


        }
        if (isPrime) {
            System.out.println("Prime");
        }else {
            System.out.println("not Prime");
        }

    }
}
