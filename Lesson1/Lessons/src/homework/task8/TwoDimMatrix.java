package homework.Task8;
public class TwoDimMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {0, 2, 9, 8},
                {0, 4, 3, 2},
                {1, 3, 2, 8}
        };
        for (int j = 0; j < arr[j].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
