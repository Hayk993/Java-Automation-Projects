package homework.Task9;

public class TwoArrayEx {
    public static void main(String[] args) {
        int[][] array = {{6, 2, 3, 2},
                         {2, 6, 3, 1},
                         {2, 2, 4, 7}
        };
        int firstLine = array[0][0] + array[1][0] +array[2][0];
        boolean ok = true;
        int sum = 0;
        for (int j = 1; j < array[0].length; j++) {
            for (int i = 1; i < array.length; i++) {
                sum = sum +array[i][j];
                if (sum == firstLine){
                    ok = true;
                }
                else ok = false;
            }
            System.out.println();

        }
        if (ok){
            System.out.println("սյան բոլոր էլեմենտների գւմար հավաս են");
        }
        else {
            System.out.println("սյան բոլոր էլեմենտների գւմար հավաս չեն");
        }
    }
}
