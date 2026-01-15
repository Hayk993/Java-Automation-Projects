package homework.Task5;

public class ArrayTask_1 {
    public static void main(String[] args) {
        /*
        Խնդիր 1։ ունենք ամբողջ թվերի զանգված. Անհրաժեշտ է անցնել զանգվածով for ցիկլի միջոցով և՝
        • բաց թողնել այն տարրերը, որոնց արժեքը հավասար է իրենց ինդեքսին
        •մնացած տարրերի արժեքները գումարել
        •եթե որևէ պահի գումարը դառնում է ավելի մեծ քան 100 — դադարեցնել ցիկլը
        •ցիկլից հետո տպել վերջնական գումարը․
         */
        int[] array = {0, 4, 2, 3, 10, 44, 66, 44, -1, 55, 4, 5, 55,};
        //1) բաց թողնել այն տարրերը, որոնց արժեքը հավասար է իրենց ինդեքսին
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                continue;
            } else {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        //2)մնացած տարրերի արժեքները գումարել
        System.out.println();
        System.out.println("the sum apart from marked index " + sum);
        // •եթե որևէ պահի գումարը դառնում է ավելի մեծ քան 100 — դադարեցնել ցիկլը
        int[] arrayStopTest = {0, 4, 2, 3, 10, 44, 66, 44, -1, 55, 4, 5, 55,};
        int sumOf100 = 0;
        for (int i : arrayStopTest) {
            sumOf100 += i;
            if (sumOf100 > 100) {
                System.out.println("Stop the sum of array is larger than 100");
                break;
            }
        }
        System.out.println("After array stop sum" + sumOf100);

    }
}
