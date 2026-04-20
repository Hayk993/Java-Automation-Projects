package homework.homeworksByShushanik;

import java.util.Scanner;

public class DoubleFactorial {
    public static void main(String[] args) {
        //2.	Տրված է n բնական թիվը: Հաշվել և արտածել n-ի կրկնակի ֆակտորիալը, որտեղ n!! = n(n–2)(n–4)…:
        // Եթե n-ը զույգ է, ապավերջին արտադրիչը հավասար է 2-ի, հակառակ դեպքում` 1-ի:
        //ասենք 8 !! = 8 * 6 * 4 * 2

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        while (number > 0) {
            result = result * number;
            number = number - 2;

        }
        System.out.println(result);
    }
}
