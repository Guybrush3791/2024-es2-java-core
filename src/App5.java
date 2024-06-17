import java.util.Arrays;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // 1. Chiedere all'utente quanti numeri vuole inserire,
        // // creare poi un array di interi di quella di mensione
        // // e chiedere all'utente ogni numero da inserire
        // System.out.println("Quanti numeri vuoi inserire?");
        // int dim = Integer.valueOf(sc.nextLine());
        // int[] arr = new int[dim];
        // for (int x = 0; x < dim; x++) {

        // System.out.println("Inserisci un numero: ");
        // arr[x] = Integer.parseInt(sc.nextLine());
        // }

        // System.out.println(Arrays.toString(arr));

        // System.out.println("-----------------------------");

        // // 2. Raffinare l'esercizio 2 accettando solo numeri pari
        // // come valori dell'array
        // // // !! //
        // int ind = 0;
        // while (ind < dim) {

        // System.out.println("Inserisci un numero: ");
        // int value = Integer.parseInt(sc.nextLine());

        // if (value % 2 == 0) {
        // arr[ind] = value;
        // ind++;
        // }
        // }

        // System.out.println(Arrays.toString(arr));

        // System.out.println("-----------------------------");

        // 3. Chiedere all'utente una stringa e contare quanti caratteri
        // contiene
        // System.out.println("Inserisci una stringa: ");
        // String str = sc.nextLine();
        // System.out.println("La stringa contiene " + str.length() + " caratteri");

        // 4. Chiedere all'utente una stringa e contare quanti caratteri
        // maiuscoli contiene
        // int minCount = 0;
        // for (char c : str.toCharArray()) {

        // if (Character.isUpperCase(c)) {
        // minCount++;
        // }
        // }
        // System.out.println("La stringa contiene " + minCount + " caratteri
        // maiuscoli");

        // int minCount = 0;
        // for (char c : str.toCharArray()) {

        // int intC = c;
        // System.out.println(c + ": " + intC);

        // if (intC >= 'A' && intC <= 'Z') {
        // minCount++;
        // }
        // }

        // 5. A partire dalla seguente stringa di interi, creare un array
        // di interi compresi tra 0 e 9
        String numStr = "3423908234";

        int[] singleDigitNumbers = new int[numStr.length()];
        for (int x = 0; x < numStr.length(); x++) {

            // int value = numStr.charAt(x) - '0';
            // int value = Integer.valueOf("" + numStr.charAt(x));
            int value = Character.getNumericValue(numStr.charAt(x));

            singleDigitNumbers[x] = value;
        }

        System.out.println(Arrays.toString(singleDigitNumbers));

        // 6. A partire dalla seguente stringa di interi, creare un array
        // di interi compresi tra 10 e 99
        String numStr2 = "5543948298";
        int numDigit = 2;

        int[] doubleDigitNumbers = new int[numStr2.length() / numDigit];
        for (int x = 0; x < numStr2.length(); x += numDigit) {

            int value = Integer.valueOf(numStr2.substring(x, x + numDigit));

            doubleDigitNumbers[x / numDigit] = value;
        }

        System.out.println(Arrays.toString(doubleDigitNumbers));

        // 7. Trovare valori minimi e massimi degli array del punto 5 e 6
        // (separatamente)
        int minSD = Integer.MAX_VALUE;
        int maxSD = Integer.MIN_VALUE;
        for (int value : singleDigitNumbers) {

            if (value < minSD) {
                minSD = value;
            }

            if (value > maxSD) {
                maxSD = value;
            }
        }

        System.out.println("Minimo: " + minSD);
        System.out.println("Massimo: " + maxSD);

        int minDD = Integer.MAX_VALUE;
        int maxDD = Integer.MIN_VALUE;
        for (int value : doubleDigitNumbers) {

            if (value < minDD) {
                minDD = value;
            }

            if (value > maxDD) {
                maxDD = value;
            }
        }

        System.out.println("Minimo: " + minDD);
        System.out.println("Massimo: " + maxDD);

        // 8. Trovare la sommatoria e media degli array di interi del punto 5 e 6
        // (unitamente)

        int totSum = 0;
        for (int value : singleDigitNumbers) {

            totSum += value;
        }
        for (int value : doubleDigitNumbers) {

            totSum += value;
        }

        int totLng = singleDigitNumbers.length + doubleDigitNumbers.length;
        int avg = totSum / totLng;

        System.out.println("Sommatoria: " + totSum);
        System.out.println("Media: " + avg);

        sc.close();
    }
}
