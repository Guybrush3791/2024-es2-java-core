import java.util.Arrays;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        // prendere 3 numeri dall'utente e sommarli tra
        // loro dopo averli salvati in un array

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int x = 0; x < arr.length; x++) {

            System.out.println("Inserisci un numero: ");
            int value = Integer.parseInt(sc.nextLine());
            arr[x] = value;
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        System.out.println("La somma dei valori inseriti è: " + sum);

        // trovare la media
        double avg = (double) sum / arr.length;

        System.out.println("La media dei valori inseriti è: " + avg);

        // trovare il valore massimo
        int max = Integer.MIN_VALUE;
        for (int value : arr) {

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Il valore massimo è: " + max);

        sc.close();
    }
}
