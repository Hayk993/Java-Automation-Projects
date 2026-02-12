package repit;

public class BubbleSort {
    public static void main(String[] args) {
      int [] array = {1,3,4,5,33,55,0,9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j]>array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
