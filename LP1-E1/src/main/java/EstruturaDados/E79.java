package EstruturaDados;

import java.util.Scanner;
import java.util.ArrayList;

public class E79 {
    public static void E79V() {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[20];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno:" + (i+1));
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        int acimaMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos acima da média: " + acimaMedia);
    }

    public static void E79L() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota:" + (i+1));
            double nota = sc.nextDouble();
            notas.add(nota);
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double mediaTurma = soma / notas.size();
        int acimaMedia = 0;

        for (double nota : notas) {
            if (nota > mediaTurma) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos acima da média: " + acimaMedia);
    }
}