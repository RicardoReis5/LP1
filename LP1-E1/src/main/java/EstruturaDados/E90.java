package EstruturaDados;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class E90 {
    public static void E90V() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lista = new int[30];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(30) + 1;
        }

        System.out.println("Vetor: " + Arrays.toString(lista));
        System.out.println("Digite um número para verificar: ");
        int inputNum = sc.nextInt();
        int numCount = 0;

        for (int a : lista) {
            if (inputNum == a) {
                numCount++;
            }
        }
        System.out.println("O número " + inputNum + " aparece " + numCount + " vezes no vetor");
    }

    public static void E90L() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (lista.size() < 30) {
            lista.add(random.nextInt(30) + 1);
        }

        System.out.println("Lista: " + lista.toString());
        System.out.println("Digite um número para verificar");
        int inputNum = sc.nextInt();
        int numCount = 0;

        for (int a : lista) {
            if (inputNum == a) {
                numCount++;
            }
        }
        System.out.println("O número " + inputNum + " aparece " + numCount + " vezes na lista");
    }
}
