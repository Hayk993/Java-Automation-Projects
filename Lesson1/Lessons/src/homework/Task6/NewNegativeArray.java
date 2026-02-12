package homework.Task6;

public class NewNegativeArray {
    public static void main(String[] args) {
        //Ենթադրենք ունեք array1։ Ստանալ array2 array1-ի բացասական թվերից։ Տպել վերջում ստացվածը
        int[] array1 = {1, -3, 4, -2, 4, -55, 44, -47, -777, 5667};
        int negNumber = -1;
        int lengthCounter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                lengthCounter++;
            }
        }
        int [] array2 = new int[lengthCounter];

        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]< 0){
                array2[index] = array1[i];
                index++;
            }

        }
        for (int i : array2) {
            System.out.println(i);
        }
    }
}
