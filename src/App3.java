public class App3 {

    public static void main(String[] args) {

        int arr[] = {
                -17, 16, 21, 23, -25,
                28, 29, 32, -33, 35
        };

        // [TODO] trovare il valore minimo
        int min = Integer.MAX_VALUE;
        for (int value : arr) {

            if (value < min) {

                min = value;
            }
        }
        System.out.println("Il valore minimo è: " + min);

        // [TODO] trovare il valore massimo
        int max = Integer.MIN_VALUE;
        for (int value : arr) {

            if (value > max) {

                max = value;
            }
        }
        System.out.println("Il valore massimo è: " + max);

        // [TODO] trovare il valore sommatoria
        int sum = 0;
        for (int value : arr) {

            sum += value;
        }
        System.out.println("Il valore sommatoria è: " + sum);

        // [TODO] trovare il valore media
        double avg = (double) sum / arr.length;
        System.out.println("Il valore media è: " + avg);

        System.out.println("--------------------");

        // [TODO] stampare tutti i valori negativi
        for (int value : arr) {

            if (value < 0) {

                System.out.println(value);
            }
        }

        System.out.println("--------------------");

        // [TODO] stampare tutti i valori pari
        for (int value : arr) {
            // for (int x=0;x<arr.length;x++)
            // int value = arr[x];

            if (value % 2 == 0) {

                System.out.println(value);
            }
        }

        System.out.println("--------------------");

        // [TODO] stampare tutti i valori multipli di 3
        for (int value : arr) {

            if (value % 3 == 0) {

                System.out.println(value);
            }
        }

        System.out.println("--------------------");

        // [TODO] stampare tutti i valori multipli di 5
        for (int value : arr) {

            if (value % 5 == 0) {

                System.out.println(value);
            }
        }

        System.out.println("--------------------");

        // [TODO] stampare tutti i valori finche' non si incontra un multiplo di 3
        // (while)
        // int ind = 0;
        // int value = arr[0];
        // while (value % 3 != 0 && ind < arr.length) {

        // value = arr[ind];
        // System.out.println(value);

        // ind++;
        // }

        for (int value : arr) {

            if (value % 3 == 0) {
                break;
            }

            System.out.println(value);
        }
    }
}
