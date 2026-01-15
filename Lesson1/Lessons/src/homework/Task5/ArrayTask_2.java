package homework.Task5;

public class ArrayTask_2 {
    public static void main(String[] args) {
        /*
        Խնդիր 2։ Ունենք ամբողջ թվերի զանգված։ Անհրաժեշտ է գտնել այնպիսի ինդեքս i, որ՝i-ից ձախ գտնվող տարրը հավասար լինի
         -i-ից աջ գտնվող տարրին
         -եթե նման ինդեքս գտնվի
         -՝տպել ինդեքսը և դադարեցնել ցիկլը
         -եթե նման ինդեքս չկա՝ տպել "No mirror index"
         */
        int[] array = {1, 2, 3, 4, 6, 5, 6, 7, 8, 9};
        boolean a = false;
        for (int i = 1; i < array.length - 1; i++) {
            if(array[i-1] == array[i+1]){
                System.out.println("array index number is " + array[i]);
                a = true;
                break;
            }
        }
        if (!a){
            System.out.println("No mirror index");

        }

    }
}
