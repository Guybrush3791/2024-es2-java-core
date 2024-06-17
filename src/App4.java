import java.util.Arrays;
import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {

        // int x = 0;

        String str = "Hello, World!";

        System.out.println(str);

        str = "Hello " + " from ";
        System.out.println(str);
        str += ", Java! ";
        System.out.println(str);

        char[] arrStr = str.toCharArray();
        System.out.println(Arrays.toString(arrStr));

        System.out.println("--------------------");

        for (char c : arrStr) {

            System.out.println(c);
        }

        System.out.println("--------------------");

        for (int x = 0; x < arrStr.length; x += 2) {

            char c = arrStr[x];
            System.out.println(c);
        }

        System.out.println("--------------------");

        for (int x = 0; x < str.length(); x++) {

            char c = str.charAt(x);
            System.out.println(c);
        }

        System.out.println("--------------------");

        String subStr = str.substring(7, 11);
        System.out.println(subStr);

        System.out.println("--------------------");

        boolean findedFrom = str.contains("from");
        System.out.println("findedFrom: " + findedFrom);

        boolean findedFromCI = str.toUpperCase().contains("FROM");
        System.out.println("findedFromCI: " + findedFromCI);

        System.out.println("--------------------");

        boolean startWithH = str.startsWith("H");
        System.out.println("startWithH: " + startWithH);

        boolean endWithExMrk = str.endsWith("!");
        System.out.println("endWithExMrk: " + endWithExMrk);

        System.out.println("--------------------");

        String fromWord = "from";
        int fromIndex = str.indexOf(fromWord);
        System.out.println("from index: " + fromIndex);
        String subStringFrom = str.substring(fromIndex, fromIndex + fromWord.length());
        System.out.println(subStringFrom);

        System.out.println("--------------------");

        String blankStr = " ";

        boolean isBlank = blankStr.isBlank();
        boolean isEmpty = blankStr.isEmpty();

        System.out.println("isBlank: " + isBlank);
        System.out.println("isEmpty: " + isEmpty);

        System.out.println("--------------------");

        str = str.repeat(10);
        System.out.println(str);

        System.out.println("--------------------");

        // str = str.replace("", "_");
        // System.out.println(str);

        // System.out.println("--------------------");

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("--------------------");

        str = str.toLowerCase();
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("--------------------\n----------------");

        String dirtyStr = " hello, world! ";
        System.out.println("\"" + dirtyStr + "\"");
        dirtyStr = dirtyStr.trim();
        System.out.println("\"" + dirtyStr + "\"");

        System.out.println("--------------------");

        Scanner sc = new Scanner(System.in);
        String userStr = sc.nextLine();

        System.out.println(userStr);

        sc.close();
    }
}
