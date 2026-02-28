package homework.Task10;

public class MatrixBuild {
    static int[][] builder(int[] array){
        int n = array.length;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[j] + i;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {1,-3,5,-5,9};
        int[][] result1 = builder(arr1);
        printMatrix(result1);

    }
}
