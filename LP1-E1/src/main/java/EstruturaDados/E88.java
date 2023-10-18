package EstruturaDados;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class E88 {
    public static void E88V() {
        Random rng = new Random();
        int[] lista = rng.ints(1, 51).distinct().limit(20).toArray();
        System.out.println("Vetor inicial: " + Arrays.toString(lista));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar: ");
        int num = sc.nextInt();

        int[] novaLista = new int[19];
        int novaListaIndex = 0;
        boolean encontrado = false;

        for (int numeros:lista) {
            if (num == numeros) {
                encontrado = true;
            }
        }

        if (encontrado) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != num) {
                    novaLista[novaListaIndex] = lista[i];
                    novaListaIndex++;
                }
            }
            System.out.println("Novo vetor sem este número: " + Arrays.toString(novaLista));
        } else {
            System.out.println("Número não encontrado");
        }
    }

    public static void E88L() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        while (lista.size() < 20) {
            int numero = random.nextInt(50) + 1;
            if (!lista.contains(numero)) {
                lista.add(numero);
            }
        }
        System.out.println("Lista inicial: " + lista.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar: ");
        int numero = sc.nextInt();

        ArrayList<Integer> novaLista = new ArrayList<>();
        int novaListaIndex = 0;
        boolean encontrado = false;

        for (int numeros:lista) {
            if (numero == numeros) {
                encontrado = true;
            }
        }

        if (encontrado) {
            for (int i = 0; i < lista.size(); i++) {
                if (numero != lista.get(i)) {
                    novaLista.add(lista.get(i));
                }
            }
            System.out.println("Nova lista sem este número " + novaLista.toString());
        } else {
            System.out.println("Número não encontrado ");
        }
    }
}
