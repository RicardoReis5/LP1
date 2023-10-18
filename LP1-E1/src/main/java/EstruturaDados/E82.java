package EstruturaDados;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class E82 {
    public static void E82V() {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Insira o valor de X:");
        int X = sc.nextInt();
        int[] A = new int[10];
        int[] M = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = rng.nextInt(21);
            M[i] = A[i] * X;
        }
        System.out.println("VEOTR A:" + Arrays.toString(A));
        System.out.println("VETOR M:" + Arrays.toString(M));
    }

    public static void E82L() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> M = new ArrayList<>();
        Random rng = new Random();
        System.out.println("Insira o valor de X:");
        int X = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            A.add(rng.nextInt(21));
            M.add(A.get(i) * X);
        }
        System.out.println("VETOR A:" + A.toString());
        System.out.println("VEOTR M:" + M.toString());
    }
}
