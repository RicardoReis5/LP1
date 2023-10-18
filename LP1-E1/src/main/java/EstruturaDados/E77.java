package EstruturaDados;

import java.util.ArrayList;
import java.util.Arrays;

public class E77 {
    public static void E77V() {
        int[] vetor = {5, 1, 4, 2, 7, 8, 3, 6};

        for (int i = 7; i >= 5; i--) {
            int aux = vetor[i];
            vetor[i] = vetor[8 - i + 1];
            vetor[8 - i + 1] = aux;
        }
        vetor[3] = vetor[1];
        vetor[vetor[3]] = vetor[vetor[2]];

        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }

    public static void E77L() {

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 7, 8, 3, 6));

        for (int i = 7; i >= 5; i--) {
            int aux = lista.get(i);
            lista.set(i, lista.get(8 - i + 1));
            lista.set(8 - i + 1, aux);
        }

        int temp = lista.get(3);
        lista.set(3, lista.get(1));
        lista.set(lista.get(3), lista.get(lista.get(2)));

        System.out.println(lista);

        }
    }