
package classwork.chapter6;

import java.util.Scanner;

public class SwitchYield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        String result = switch (n) {
            case 1 -> "One";
            case 2 -> "two";

            case 3 ->
            {
                System.out.println("jhjcsjbc");
                yield "three";
            }
            default -> "none";
        };
        System.out.println(result);



    }
}
