package repit;

public class IsPrimeAdvanced {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num/2 ; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }

        }

    }
}
