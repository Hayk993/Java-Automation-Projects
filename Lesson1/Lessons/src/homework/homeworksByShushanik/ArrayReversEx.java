package homework.homeworksByShushanik;

public class ArrayReversEx {
    public static void main(String[] args) {
        // մասի էլեմենտները տեղափոխել հակառակ ձևով
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//     int temp = array[0];Swap
//     array[0] =array[1];
//     array[1] = temp;


        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

}
