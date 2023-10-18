package EstruturaDados;
import java.util.Objects;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class E89 {
    public static void E89V() {
        Random random = new Random();
        int[] vet1 = new int[15];
        int[] vet2 = new int[15];

        for (int i = 0; i < vet1.length; i++) {
            int numv1 = random.nextInt(20) + 1;
            int numv2 = random.nextInt(20) + 1;
            vet1[i] = numv1;
            vet2[i] = numv2;
        }

        System.out.println("Vetor 1: " + Arrays.toString(vet1));
        System.out.println("Vetor 2: " + Arrays.toString(vet2));

        int contador = 0;

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] == vet2[i]) {
                contador++;
            }
        }
        System.out.println("Quantidade de elementos iguais nas mesmas posições:" + contador);
    }

    public static void E89L() {
        Random random = new Random();
        ArrayList<Integer> vet1 = new ArrayList<>();
        ArrayList<Integer> vet2 = new ArrayList<>();

        while (vet1.size() < 15){
            int numv1 = random.nextInt(20) + 1;
            int numv2 = random.nextInt(20) + 1;
            vet1.add(numv1);
            vet2.add(numv2);
        }

        System.out.println("Lista 1: " + vet1.toString());
        System.out.println("Lista 2: " + vet2.toString());

        int contador = 0;
        for (int i = 0; i < vet1.size(); i++) {
            if (Objects.equals(vet1.get(i), vet2.get(i))) {
                contador++;
            }
        }
        System.out.println("Quantidade de elementos iguais nas mesmas posições:" + contador);
    }
}
