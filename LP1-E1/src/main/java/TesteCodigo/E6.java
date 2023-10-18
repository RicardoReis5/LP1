package TesteCodigo;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a base: ");

        int base = sc.nextInt();
        System.out.println("Insira a altura: ");

        int altura = sc.nextInt();
        int area = base * altura;
        System.out.println(area);

        sc.close();
    }
}
