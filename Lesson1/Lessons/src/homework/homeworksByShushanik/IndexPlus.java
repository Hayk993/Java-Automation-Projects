package homework.homeworksByShushanik;

public class IndexPlus {
    public static void main(String[] args) {
        //4.	Հաշվել n-անիշ (օրինակ՝ եռանիշ) թվի թվանշանների գումարը և գումարել այն n-անիշ թվին:
        int a = 4543;
        int i = a;
        int sum = 0;
        while (i > 0) {
            sum = sum + i%10;
            i = i/10;
        }
        System.out.println(sum);
        int result = a + sum;
        System.out.println(result);
    }


}
