package TesteCodigo;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de votos brancos: ");
        int branco = sc.nextInt();
        System.out.println("Insira o número de votos nulos: ");
        int nulo = sc.nextInt();
        System.out.println("Insira o número de votos válidos: ");
        int valido = sc.nextInt();
        sc.close();
        
        int total = branco + nulo + valido;
        int porcentBranco = branco * 100 / total;
        int porcentNulo = nulo * 100 / total;
        int porcentValido = valido * 100 / total;
        System.out.println("Votos brancos: " + porcentBranco + "%");
        System.out.println("Votos nulos: " + porcentNulo + "%");
        System.out.println("Votos válidos: " + porcentValido + "%");   
    }
}
