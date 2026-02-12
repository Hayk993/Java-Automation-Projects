package repit;

public class Three {
    public static void main(String[] args) {
        int[] array = {0, 3, -1, 48, 5, 7, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];

            }

        }
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println(secondMax);


    }

}

