import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr2 = new int[5]; // {0, 0, 0, 0, 0}

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        // int[][] mat = {

        // // 0 1 2
        // { 1, 2, 3 }, // 0
        // { 4, 5, 6 }, // 1
        // { 7, 8, 9 } // 2
        // };

        // int[] arr1 = mat[0];
        // int[] arr2 = mat[1];
        // int[] arr3 = mat[2];

        // int val11 = mat[0][0]; // arr1[0]; // = 1
        // int val12 = mat[0][1]; // arr1[1]; // = 2

        // int val21 = mat[1][0]; // arr2[0]; // = 4

        // int val33 = mat[2][2]; // arr3[2]; // = 9

        // System.out.println(val11);
        // System.out.println(val12);
        // System.out.println(val21);
        // System.out.println(val33);

        // int x = 0;
        // while (x < arr.length) {

        // System.out.println(arr[x]);

        // x++;
        // }
        // for (int x = 0; x < arr.length; x++) {

        // int val = arr[x];

        // // ...

        // System.out.println(val);
        // }
        // for (int val : arr) {

        // // ...

        // System.out.println("val: " + val);
        // }

        // System.out.println("The end");

        // for (int x = 0; x < mat.length; x++) {
        // for (int y = 0; y < mat[x].length; y++) {
        // System.out.println(mat[x][y]);
        // }
        // }

        // -------------------------

        // Scanner sc = new Scanner(System.in);
        // int userValSum = 0;
        // while (userValSum < 100) {

        // System.out.println("Dimmi un numero diverso da 50:");
        // int userVal = Integer.parseInt(sc.nextLine());

        // if (userVal == 50) {
        // System.out.println("Non mi hai ascoltato, riprova");
        // continue;
        // }
        // // if (userVal == 50) {
        // // System.out.println("Non mi hai ascoltato! Looser!");
        // // break;
        // // }

        // userValSum += userVal;
        // }

        // System.out.println("User val sum: " + userValSum);
        // sc.close();

        int[] arr = { 1, 2, 3 };
        // System.out.println(arr); // error
        System.out.println(Arrays.toString(arr));
    }
}
