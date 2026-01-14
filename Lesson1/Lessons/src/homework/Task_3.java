package homework;

import java.sql.SQLOutput;

public class Task_3 {
    public static void main(String[] args) {
        /*
        1․ Ունեք int տիպի մեկ փոփոխական, որը ներկայացնում է մարդու տարիքը։
           Պետք է ստուգեք՝ արդյոք մարդը գտնվում է 18-ից 65 տարիքային միջակայքում (ներառյալ)։
           Օգտագործեք միայն logical operators (&&)։
           Եթե պայմանը ճիշտ է՝ տպեք "Allowed", հակառակ դեպքում "Not allowed"։
         */

        int a = 17;
        //or
        if (a >= 18 && a <= 65) {

            System.out.println("Allowd");

        } else {
            System.out.println("Not allowed");
        }
        System.out.println("cod with ternar");
        int b = 65;
        System.out.println(b >= 18 && b <= 65 ? "Allowd" : "Not allowed");


        /*
        2․ Ունեք երկու փոփոխական․
         boolean hasTicket
         boolean hasInvitation
         Մարդը կարող է մտնել միջոցառման, եթե ունի տոմս ԿԱՄ հրավեր։
         Գրեք ծրագիր, որը || օպերատորի միջոցով կստուգի դա և կտպի համապատասխան հաղորդագրություն։
         */
        boolean hasTicket = true;
        boolean hasInvitation = false;
        if (hasTicket || hasInvitation) {

            System.out.println("You can enter ");

        } else {
            System.out.println("You do not have invitation");
        }
        //or
        System.out.print("cod with ternar: ");
        System.out.println(hasInvitation || hasTicket ? " You can enter " : "You do not have invitation");

        /*
        3․ Ունեք երեք int փոփոխական՝ a, b, c։
           Ստուգեք արդյոք գոնե երկուսը դրական են։
           Օգտագործեք && և ||։
         */
        int c = 3;
        int d = -2;
        int m = 5;

        System.out.println(c > 0 && d > 0 || m > 0 ? "At least both are positive." : "At least both are negativ");

        /*
        4, Ունեք երկու int փոփոխական։
        Կատարեք նրանց միջև bitwise OR (|) և պահեք արդյունքը երրորդ փոփոխականի մեջ։
        Տպեք բոլոր երեք արժեքները։
         */
        int x = 10;
        int y = 6;

        int bitRes = x | y;
        System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "bitRes = " + bitRes);
        /*
        5․ Ունեք երկու int փոփոխական։
           Օգտագործելով if / else, տպեք մեծագույն արժեքը։
           Եթե հավասար են՝ տպեք "Equal"։
         */
        int s = 5;
        int l = 5;
        boolean res = s == l;

        if (s > l) {
            System.out.println(s);
        } else if (s < l) {
            System.out.println(l);

        } else if (res) {
            System.out.println("is equl");

        }
        /*
        6․ Ունեք ուսանողի գնահատականը (0–100)։
           Գրեք ծրագիր, որը ըստ գնահատականի կտպի․
                90–100 → "Excellent"
                70–89 → "Good"
                50–69 → "Average"
                0–49 → "Fail"
                Օգտագործեք if / else ։
         */
        int var = 1000;
        if (var >= 90 && var <= 100) {
            System.out.println("Excellent");
        } else if (var >= 70 && var <= 89) {
            System.out.println("Good");

        } else if (var >= 50 && var <= 69) {

            System.out.println("Average");
        } else if (var >= 0 && var <= 49) {
            System.out.println("Fail");

        } else {
            System.out.println("you do not switch the number 0 - 100");
        }

        /*
        *7, Ունեք երկու boolean արժեք (true կամ false), բայց պահված են int տիպով (0 կամ 1)։
        Օգտագործելով bitwise XOR (^), ստուգեք՝ արդյոք արժեքները տարբեր են։
        Եթե տարբեր են՝ տպեք "Different", հակառակ դեպքում "Same"։
         */

        int j = 1; // true
        int k = 0; // false

        if ((j ^ k) == 1) {
            System.out.println("Different");
        } else {
            System.out.println("Same");
        }
        /*
        **8․ Ունեք մեկ int թիվ։
        Օգտագործելով միայն bitwise &, ստուգեք՝ թիվը զույգ է, թե կենտ։
        Եթե զույգ է՝ տպեք "Even", հակառակ դեպքում "Odd"։
         */

        int oddOrEven = 9;
        if ((oddOrEven & 1) == 0) {
            System.out.println("even");

        } else
            System.out.println("odd");


    }

}
