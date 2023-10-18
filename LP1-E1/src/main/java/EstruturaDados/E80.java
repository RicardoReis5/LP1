package EstruturaDados;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class E80 {
    public static void E80V() {
        int Q[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));

        int maiorElemento = 0;
        int maiorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] > maiorElemento) {
                maiorElemento = Q[i];
                maiorPosicao = i+1;
            }
        }
        System.out.println("Maior valor de Q: " + maiorElemento);
        System.out.println("Posição do maior elemento: " + maiorPosicao);
    }

    public static void E80L() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(random.nextInt(101));
        }
        System.out.println(Q.toString());

        int maiorElemento = 0;
        int maiorPosicao = 0;

        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) > maiorElemento) {
                maiorElemento = Q.get(i);
                maiorPosicao = i+1;
            }
        }
        System.out.println("Maior valor de Q: " + maiorElemento);
        System.out.println("Posição do maior elemento: " + maiorPosicao);

    }
}