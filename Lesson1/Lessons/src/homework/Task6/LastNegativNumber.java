package homework.Task6;

public class LastNegativNumber {
    public static void main(String[] args) {
        //Գտնել array-ի վերջին բացասական թիվը։
        // Տպել թիվն ու դրա ինդքեսը։ Եթե չկա տենց թիվ, տպել համապատասխան հաղորդագրություն։
        int[] array = {1, -3, 4, -2, 4, -55, 44, -47, -777, 5667};
        int lastNegativIndex =-1;
        int lastNegativValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                lastNegativValue =array[i];
                lastNegativIndex = i;
            }
        }
       if(lastNegativIndex != -1){
           System.out.println("last Negativ Value is " + lastNegativValue);
           System.out.println("Last Negative Index is " + lastNegativIndex);
       }else {
           System.out.println("there is not negative number");
       }
    }
}
