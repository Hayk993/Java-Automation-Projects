package homework.task23;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {4, 7, 1, 20, 3};

        System.out.println(findMax(numbers));



        House[] houses = {
                new House(120),
                new House(350),
                new House(200)
        };

        System.out.println(findMax(houses));



        String[] names = {
                "Hayk",
                "Anna",
                "Karen"
        };

        System.out.println(
                contains(names, "Anna")
        );



        Car[] cars = {
                new Car("BMW"),
                new Car("Audi"),
                new Car("Mercedes")
        };

        System.out.println(
                contains(cars, new Car("Audi"))
        );


        User[] users = {
                new User(1),
                new User(2),
                new User(3)
        };

        Product[] products = {
                new Product("A101"),
                new Product("B202"),
                new Product("C303")
        };

    }

    static <T extends Comparable<T>>
    T findMax(T[] arr) {

        T max = arr[0];

        for (T element : arr) {

            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    static <T> boolean contains(T[] arr, T arg) {

        for (T element : arr) {

            if (element.equals(arg)) {
                return true;
            }
        }

        return false;
    }

    static <E extends Identifiable<R>, R>
    R[] extractIds(E[] arr) {

        R[] result = (R[]) new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] = arr[i].getId();
        }

        return result;
    }
}

interface Identifiable<R> {

    R getId();
}





