package EstruturaDados;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class E81 {
    public static void E81V() {
        int Q[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));

        int menorElemento = Q[0];
        int menorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] < menorElemento) {
                menorElemento = Q[i];
                menorPosicao = i+1;
            }
        }
        System.out.println("Menor valor de Q: " + menorElemento);
        System.out.println("Posição do menor elemento: " + menorPosicao);
    }

    public static void E81L() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(random.nextInt(101));
        }
        System.out.println(Q.toString());

        int menorElemento = Integer.MAX_VALUE;
        int menorPosicao = 0;

        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) < menorElemento) {
                menorElemento = Q.get(i);
                menorPosicao = i+1;
            }
        }
        System.out.println("Menor valor de Q: " + menorElemento);
        System.out.println("Posição do menor elemento: " + menorPosicao);

    }
}