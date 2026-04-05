package homework.Task6;

public class ArrayExample {
    public static void main(String[] args) {
        //Ունեք ամբողջ միանիշ թվերից բաղկացած array,
        // ասենք մաքսիմումը 8 երկարությամբ։
        // Պետքա ստանաք ու տպեք էն թիվը, որը կստսացվի տվյալ array-ը ձախից աջ կարդալուց։
        // Օրինակ array = {1, 0, 7, 9}։ Հետևաբար թիվը պետքա լինի 1079։
        int[] array = {1, 0, 7, 9};
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = number * 10 + array[i];

        }
        System.out.println(number);
    }
}
