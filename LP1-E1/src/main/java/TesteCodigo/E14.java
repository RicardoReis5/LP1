package TesteCodigo;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = sc.nextInt();
        sc.close();

        if (num > 10) {
            System.out.println("É MAIOR QUE 10!");
        }
        else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}