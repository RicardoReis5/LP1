package EstruturaDados;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class E91 {
    public static void E91VL() {
        Random random = new Random();
        int[] vet = new int[50];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(51);
        }

        System.out.print("Vetor: " + Arrays.toString(vet));
        for (int num : vet) {
            System.out.print(num + " ");
        }

        ArrayList<Integer> numRepetidos = new ArrayList<>();

        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    numRepetidos.add(vet[i]);
                    break;
                }
            }
        }

        if (numRepetidos.isEmpty()) {
            System.out.println("Não há números repetidos.");
        } else {
            System.out.println("Números repetidos e suas posições:");
            for (int num : numRepetidos) {
                System.out.print("Número " + num + ", Posições: ");
                for (int i = 0; i < vet.length; i++) {
                    if (vet[i] == num) {
                        System.out.print((i + 1) + " | ");
                    }
                }
                System.out.println();
            }
        }
    }
}