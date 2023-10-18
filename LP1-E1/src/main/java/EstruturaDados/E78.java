package EstruturaDados;

import java.util.Scanner;
import java.util.ArrayList;

public class E78 {
    public static void E78V() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Digite o nome para verificar: ");
        String nomeVerificar = sc.next();

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nomeVerificar.equals(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
        sc.close();
    }
    public static void E78L() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o nome " + (i + 1) + ": ");
            String nome = sc.next();
            nomes.add(nome);
        }

        System.out.println("Digite um nome para verificar:");
        String nomeVerificar = sc.next();

        sc.close();

        if (nomes.contains(nomeVerificar)){
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

    }
}