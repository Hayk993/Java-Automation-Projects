package homework.Task1_2_3;

public class Task_1_Variables {
    public static void main(String[] args) {
        /*Սահմանում եք 3 հատ int տեսակի փոփոխական - a, b, c։ Ձեր ծրագիրը պետքա՝
Գտնի տվյալ թվերի միջին թվաբանականը ու տպի (ճիշտ մաթեմատիկական արժեքը)։
Ստանա եռանիշ թիվ abc
Պետքա առանձին պահի տասնորդական հատվածը։ Այսինքն եթե օրինակ միջին թվաբանականը կանգնելա 23.45, ձեր ծրագիրը պետքա առանձնացնի 0.45-ը ինչ-որ կերպ ու պահի համապատասխան տիպի փոփոխականի մեջ, հետո տպի էդ փոփոխականը։
Ինքներդ ձեզ բզբզացեք ու գուգլեք, տեսեք թե ոնց կարելիա ինֆորմատիվ տպել։ Ասենք որ լինի Decimal part of the number is 0.45, կամ էն, ինչ որ ստացել եք
         */

        int a, b, c;
        a = 3;
        b = 1;
        c = 9;
        double d = (a + b + c) / 3d;
        System.out.println(d);
        // 1
        double decimalPart = d % 1;
        System.out.println("first decmalPart variant " + decimalPart);
        //
        int abc = a * 100 + b * 10 + c;
        System.out.println(abc);
        //2
        double decimalPart2 = d - (int) d;
        System.out.println("second decmalPart variant " + decimalPart2);
        // char example:ունեք char ch = '8', ուրեմն ձեր inti k-ն պետքա ինչ-որ գործողության արդյունքում պահի 8 թիվը

        char ch = '8';
        int k = ch - '0';
        System.out.println(k);

        //
        int t = 2;
        int h = 3;

        int result = (t + h) * (t + h) * (t + h);

        System.out.println(result);


    }
}
