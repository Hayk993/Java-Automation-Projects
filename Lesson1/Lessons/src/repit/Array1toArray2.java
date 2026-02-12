package repit;

public class Array1toArray2 {
    public static void main(String[] args) {
        int[] array1 = {-1, -2, -4, 3, -6, -7, 8, -88, 9, 10, 10, 22, 33, 44};
        int lengtCounter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                lengtCounter++;
            }

        }
        int index = 0;
        int[] array2 = new int[lengtCounter];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array2[index] = array1[i];
                System.out.println(array2[index]);
                index++;
            }

        }
    }
}
