package homework.Task10;

public class StringMeth {
    public static void main(String[] args) {
        String name = "  Po xo s ";//համարյա String - ի բոլոր մեթոդնեը վերադարձնոողով են
        System.out.println(name.trim());//trim is a return typ meth//ջնջում է դիմացից ու վերջից
        System.out.println(name.toUpperCase());//բոլոր տառերը դարձնում է մեծատառ
        System.out.println(name.toLowerCase());//փոքրատառ
        System.out.println(name.endsWith("s"));
        System.out.println(name.startsWith(" "));

        String name1 = "Poxos Poxosyan";
        System.out.println(name1.substring(6));
        System.out.println(name1.substring(6,9));//startIndex,endIndex
        System.out.println(name1.charAt(0));
        System.out.println(name1.split("p"));
        System.out.println("-------");
        char c = name1.charAt(2);
        System.out.println(c);
        char[] charArray = name1.toCharArray();// ctrl alt v(variable)
        System.out.println(charArray);
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'o') {
                System.out.print(charArray[i]);

            }

        }


    }
}
