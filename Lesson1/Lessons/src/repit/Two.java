package repit;

public class Two {
    public static void main(String[] args) {
        //Ունեք ցանկացած քառանիշ թիվ, 1000-9999 միջակայքում։ Պետքա գրեք ծրագիր, որը կտպի ձեր թվի թվանշանները հատ առ հատ։
        // Այսինքն եթե ունեք թիվ 2088, պետքա տպի 2, 0, 8, 8 (կամ ձեզ հարմար ֆորմատով ու հերթականությամբ),
        // կարևորը որ տպված թվերը լինեն հենց integer թվեր։
        int v = 4321;
        int[] array = new int[4];
        for (int i = 3; i >= 0; i--) {
            array[i] = v % 10;
            v = v / 10;

        }
        for (int i : array) {
            System.out.print(i);

        }
        int a = 0;
        int b = 0;

        int c = a++;
        int d = b++;

        int e = --c;
        int f = --d;

        int m = 334344847;
        int n = 15;
        long k = (long) m*n;




    }
}
