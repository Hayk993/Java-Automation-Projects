package homework.task22;

public class Main {

    public static int binarySearch(double[] arr, double target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        double[] arr = {100, 90, 80, 70, 60};

        for (double x : arr) {
            if (x < 0) {
                throw new RuntimeException("the negativ number do not allowd");
            }
        }

        int result = binarySearch(arr, 80, 0, arr.length - 1);
        System.out.println(result); // 2
    }
}

