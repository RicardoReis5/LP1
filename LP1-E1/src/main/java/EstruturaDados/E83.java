package EstruturaDados;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class E83 {
    public static void E83V() {
        int[] lista = new int[20];
        int[] listaInversa = new int[20];
        Random rng = new Random();

        int inversaInd = 19;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(101);
            listaInversa[inversaInd - i] = lista[i];
        }
        System.out.println("VETOR NORMAL: " + Arrays.toString(lista));
        System.out.println("VETOR INVERSO: " + Arrays.toString(listaInversa));
    }

    public static void E83L() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaInversa = new ArrayList<>();
        Random rng = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(rng.nextInt(101));
            listaInversa.add(0, lista.get(i));
        }
        System.out.println("VETOR NORMAL: " + lista.toString());
        System.out.println("VETOR INVERSO: " + listaInversa.toString());
    }
}
