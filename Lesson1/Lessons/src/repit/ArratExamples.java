package repit;

public class ArratExamples {
    public static void main(String[] args) {
 //Խնդիր 3։
        // Տրված է ամբողջ թվերի զանգված։ Անհրաժեշտ է․
        //բաց թողնել բոլոր բացասական թվերը
        //•	ստուգել, որ զանգվածը լինի խիստ աճող
        //•	եթե աճման կարգը խախտվում է՝
        //•	տպել խախտման ինդեքսը և դադարեցնել ցիկլը
        //•	եթե խախտում չկա՝ տպել "OK"
        int[] array = {1,2,3,4,5,6,-7,-8,7,-8,8,9,10};
        boolean plus = true;
        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i]);

        }
    }
}
