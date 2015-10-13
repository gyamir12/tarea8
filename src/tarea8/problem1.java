package tarea8;

import java.util.Random;

/**
 * Created by yamir on 10/12/15.
 */
public class problem1 {
    /* se tienen 30 numeros enteros que deseamos conocer si los ultimos 25 numeros de ese conjunto son divisibles por 5 y
      si los primeros diez numeros tiene una sumatoria par.
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        int vector1[];
        vector1 = new int[30];
        for (int j = 0; j < 30; j++) {
            vector1[j] = (int) (rnd.nextDouble() * 100 + 1);
        }
        int k;
        int cont = 0;
        int cont1 = 0;
        for (k = 5; k < 30; k++) {
            System.out.println(vector1[k]);
            if (vector1[k] % 5 == 0)

            {
                System.out.println(" es divisible entre 5 el numero posicionado en " + k);
                cont = cont + 1;
            } else {
                System.out.println("no es divisible entre 5 el numero posicionado en " + k);
                cont1 = cont1 + 1;
            }
        }
        System.out.println(" hay " + cont + " numeros divisibles entre 5 ");
        System.out.println(" hay " + cont1 + " numeros no divisibles entre 5 ");
        int cont2 = 0;
        int cont22 = 0;
        for (int l = 0; l < 10; l++) {
            if (vector1[l] % 2 == 0) {
                cont2 = cont2 + 1;
            } else {
                cont22 = cont22 + 1;
            }

        }
        System.out.println("hay " + cont2 + " numeros pares");
        System.out.println("hay " + cont22 + " numeros impares");
    }
}
