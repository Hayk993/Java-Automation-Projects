package classwork.chapter6;

public class TwoDimArray {
    public static void main(String[] args) {
        int k = 0;
        int twoDim[][] = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoDim[i][j] = k;
                k++;


            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDim[i][j] + " ");
                System.out.println();
            }
        }

    }
}
