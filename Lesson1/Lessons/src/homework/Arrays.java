package homework;

public class Arrays {
    public static void main(String[] args) {

        /*
        Ունեք ցանկացած քառանիշ թիվ, 1000-9999 միջակայքում։ Պետքա գրեք ծրագիր, որը կտպի ձեր թվի թվանշանները հատ առ հատ։
         Այսինքն եթե ունեք թիվ 2088, պետքա տպի 2, 0, 8, 8 (կամ ձեզ հարմար ֆորմատով ու հերթականությամբ), կարևորը որ տպված թվերը լինեն հենց integer թվեր։
         */
        int number = 2088;
        int[] array = new int[4];
        for (int i = 3; i >= 0; i--) {

            array[i] = number % 10;
            number = number / 10;

        }
        for (int k : array) {
            System.out.print(k + ",");
        }

            /*
            Ունեք 2 հատ int տիպի a, b  փոփոխական։ Վերագրում եք  դրանք 2 այլ c, d փոփոխականի նենց, որ վերագրման statement-ի ավարտից հետո c-ն ու d-ն ընդունեն a-ի ու b-ի սկզբնական արժեքները,
            իսկ a-ն ու b-ն մեկով մեծացած լինեն։
             Հետո c, d փոփոխականները վերագրեք այլ e, f փոփոխականների նենց, որ e-ն ու f-ը ընդունեն c-ի ու d-ի մինչև վերագրումն ունեցած արժեքները,
             իսկ assignment-ի statement-ից հետո c-ի ու d-ի արժեքները մեկով պակասեն։
             */
        System.out.println();


        int a = 0;
        int b = 0;

        int c = a++;
        int d = b++;

        int e = c--;
        int f = d--;

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("e " + e);
        System.out.println("f " + f);


    /*
    Ունեք 2 հատ int փոփոխական։ a = 334344847, b = 15 Դրանք պետքա ունենան բավականին մեծ արժեքներ,
     ու պետքա բազմապատկեք իրար, պահեք 3-րդ փոփոխականի մեջ։
     */
        int n = 334344847;
        int m = 15;
        int v = n*m;
        long castResult = (long) n * m;
        System.out.println("castResult = " + castResult);



    }
}
