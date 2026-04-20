package homework.task19;

import java.util.SplittableRandom;

public class StringException {
    public static void main(String[] args) {
        String s = "123t";
        try {
            int n = Integer.parseInt(s);
            System.out.println(n * 2);
        } catch (NumberFormatException e) {
            System.out.println("please input only numbers!!!");
        }


    }
}
