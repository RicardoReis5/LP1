package TesteCodigo;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário mínimo mensal: ");

        double salario = sc.nextDouble();
        System.out.println("Insira a porcentagem de reajuste: ");

        double porcentagem = sc.nextDouble();
        double novoSalario = salario + (salario * porcentagem / 100);
        System.out.println("O salário reajustado é igual a R$" + novoSalario);
        
        sc.close();
    }
}
