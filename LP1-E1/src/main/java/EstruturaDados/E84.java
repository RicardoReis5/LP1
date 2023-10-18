package EstruturaDados;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class E84 {
    public static void E84V() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o tamanho da lista");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] soma = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(51);
            B[i] = random.nextInt(51);
            soma[i] = A[i] + B[i];
        }
        System.out.println("vetor A: "+ Arrays.toString(A));
        System.out.println("vetor B: " + Arrays.toString(B));
        System.out.println("vetor soma:" + Arrays.toString(soma));
    }

    public static void E84L() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o tamanho da lista");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> soma = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(random.nextInt(51));
            B.add(random.nextInt(51));
            soma.add(A.get(i) + B.get(i));
        }
        System.out.println("VETOR A: "+ A.toString());
        System.out.println("VETOR B: " + B.toString());
        System.out.println("VETOR SOMA:" + soma.toString());
    }
}
