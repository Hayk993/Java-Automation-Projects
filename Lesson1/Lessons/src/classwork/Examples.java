package classwork;

public class Examples {
    public static void main(String[] args) {
        int []array = {1,2,1};
        boolean b = true;
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1-i]){
                b = false;
            }

        }
        if (b){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}


