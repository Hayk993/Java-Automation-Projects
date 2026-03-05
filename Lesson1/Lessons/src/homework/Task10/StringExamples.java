package homework.Task10;

public class StringExamples {
    public static String cutString(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return str.substring(i);
            }

        }
        return "";
    }
     public static String cutString(String str, char ch1, char ch2) {

        int start = -1;
        int end = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1 && start == -1) {
                start = i;
            }
            if (str.charAt(i) == ch2) {
                end = i;
            }
        }

        if (start != -1 && end != -1 && start <= end) {
            return str.substring(start, end + 1);
        }

        return "";
    }

    public static void main(String[] args) {

        System.out.println(cutString("whalabi", 'h'));
        System.out.println(cutString("whalabi",'a','b'));

    }
}

