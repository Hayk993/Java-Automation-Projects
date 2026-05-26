package homework.task24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println(sum(n));
        LinkedList<Double> doubles = new LinkedList<>();

        doubles.add(1.5);
        doubles.add(2.5);

        System.out.println(sum(doubles));
    }

    static double sum(List<? extends Number> list) {

        double sum = 0;

        for (Number number : list) {

            sum += number.doubleValue();
        }

        return sum;
    }
}


