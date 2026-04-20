package homework.homeworksByShushanik;

public class WhileReversEx {
    public static void main(String[] args) {
        // մասի էլեմենտները տեղափոխել հակառակ ձևով

//     int temp = array[0];Swap
//     array[0] =array[1];
//     array[1] = temp;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] =array[right];
            array[right] = temp;
            left++;
            right--;

        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
