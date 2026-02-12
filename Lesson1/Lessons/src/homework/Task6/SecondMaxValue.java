package homework.Task6;

public class SecondMaxValue {
    public static void main(String[] args) {
        //Գտնել ամբողջ թվերի array-ի մեջի 2-րդ ամենամեծ թիվը։
        int[] array = {5, 10, 3, 7};
        int max = array[0];
        int secondMaxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMaxNumber = max;
                max = array[i];
            } else if(array[i] > secondMaxNumber && array[i]!=max){
                secondMaxNumber =array[i];
            }
        }
        System.out.println(secondMaxNumber);
    }

}
