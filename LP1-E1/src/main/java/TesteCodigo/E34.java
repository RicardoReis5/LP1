package TesteCodigo;

import java.util.Scanner;

public class E34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor para X: ");

        double numX = sc.nextDouble();
        System.out.println("Insira um valor para Y: ");

        double numY = sc.nextDouble();
        sc.close();
        double numZ = (numX * numY) + 5;
        String resposta = "";

        if (numZ <= 0) {
            resposta = "A";
        }
        else if (numZ <= 100) {
            resposta = "B";
        }
        else {
            resposta = "C";
        }
        System.out.println("Valor de Z = " + numZ + " | Resposta = " + resposta);
    }
}