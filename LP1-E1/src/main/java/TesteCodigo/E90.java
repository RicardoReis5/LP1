package TesteCodigo;

import java.util.Scanner;

public class E90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenVetor = 30;
        int[] vetor = new int[lenVetor];

        for (int i = 0; i < lenVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Digite o número a ser pesquisado: ");

        int numPesquisado = sc.nextInt();
        sc.close();
        int contagem = 0;

        for (int i = 0; i < lenVetor; i++) {
            if (vetor[i] == numPesquisado) {
                contagem++;
            }
        }
        System.out.println("O número " + numPesquisado + " aparece " + contagem + " vezes no vetor.");
    }
}