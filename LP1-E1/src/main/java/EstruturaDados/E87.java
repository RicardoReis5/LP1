package EstruturaDados;
import java.util.Arrays;
import java.util.Random;

public class E87 {
    public static void E87V() {
        Random random = new Random();
        int[] vetor = new int[11];

        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(51);
        }
        System.out.println("Vetor inicial: " + Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        int num = random.nextInt(51);
        System.out.println("Elemento adicionado: " + num);

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] == 0) {
                    vetor[j-1] = num;
                }
                if (vetor[j-1] > vetor[j]) {    
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado + Elemento adicionado: " + Arrays.toString(vetor));
    }

    public static void E87L() {
        Random random = new Random();
        java.util.ArrayList<Integer> vetor = new java.util.ArrayList<>();

        for (int i = 0; i < 10; i++) {
            vetor.add(random.nextInt(51));
        }
        System.out.println("Lista inicial: " + vetor.toString());

        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int temp = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, temp);
                }
            }
        }
        System.out.println("Lista ordenada: " + vetor.toString());
        int num = random.nextInt(51);
        System.out.println("Elemento adicionado: " + num);
        vetor.add(num);

        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int aux = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, aux);
                }
            }
        }
        System.out.println("Lista ordenada + Elemento adicionado:" + vetor.toString());
    }
}