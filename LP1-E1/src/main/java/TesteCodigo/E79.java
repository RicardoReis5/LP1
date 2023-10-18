package TesteCodigo;

import java.util.Scanner;

public class E79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = 20;
        double[] notas = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        sc.close();

        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += notas[i];
        }

        double media = soma / tamanho;
        int acimadaMedia = 0;
        for (int i = 0; i < tamanho; i++) {
            if (notas[i] > media) {
                acimadaMedia++;
            }
        }
        System.out.println("Média da turma: " + media);
        System.out.println("Alunos com nota acima da média: " + acimadaMedia);
    }
}
