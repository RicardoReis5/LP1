package TesteCodigo;

public class E1 {
    public static void main(String[] args) {
        int numA = 10;
        int numB = 20;
        int numC = numA;
        System.out.println(numA);
        System.out.println(numB);

        numA = numB;
        numB = numC;
        System.out.println(numA);
        System.out.println(numB);
    }
}