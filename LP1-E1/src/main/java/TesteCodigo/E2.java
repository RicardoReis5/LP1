package TesteCodigo;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a letra do exercício: ");
        String exec = sc.nextLine();

        switch(exec){
            case "a":
                execA(args);
                break;
            case "b":
                execB(args);
                break;
            case "c":
                execC(args);
                break;
            case "d":
                execD(args);
                break;
            case "e":
                execE(args);
                break;
            case "f":
                execF(args);
                break;
            default:
                break;
        }
        sc.close();
    }
    public static void execA(String[] args) {
        int numA = 10;
        int numB = 20;
        System.out.println(numB);

        numB = 5;
        System.out.println(numA);
        System.out.println(numB);
    }
    public static void execB(String[] args) {
        int numA = 30;
        int numB = 20;
        int numC = numA + numB;
        System.out.println(numC);

        numB = 10;
        System.out.println(numB);
        System.out.println(numC);

        numC = numA + numB;
        System.out.println(numA);
        System.out.println(numB);
        System.out.println(numC);
    }
    public static void execC(String[] args) {
        int numA = 10;
        int numB = 20;
        int numC = numA;
        numB = numC;
        numA = numB;
        System.out.println(numA);
        System.out.println(numB);
        System.out.println(numC);
    }
    public static void execD(String[] args) {
        int numA = 10;
        int numB = numA + 1;
        numA = numB + 1;
        numB = numA + 1;
        System.out.println(numA);

        numA = numB + 1;
        System.out.println(numA);
        System.out.println(numB);
    }
    public static void execE(String[] args) {
        int numA = 10;
        int numB = 5;
        int numC = numA + numB;
        numB = 20;
        numA = 10;
        System.out.println(numA);
        System.out.println(numB);
        System.out.println(numC);
    }
    public static void execF(String[] args) {
        int numX = 1;
        int numY = 2;
        int numZ = numY - numX;
        numX = 5;
        numY = numX + numZ;
        System.out.println(numX);
        System.out.println(numY);
        System.out.println(numZ);
    }
}
