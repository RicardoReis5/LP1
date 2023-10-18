package EstruturaDados;
import java.util.Random;
import java.util.ArrayList;

public class E85 {
    public static void E85V() {
        Random random = new Random();
        double tempMin = -5;
        double tempMax = 45;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        double[] temp = new double[365];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = random.nextDouble()*(tempMax - tempMin) + tempMin;
            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
            soma+= temp[i];
        }

        double media = soma/365;
        int inferiorMedia = 0;

        for (double v : temp) {
            if (v < media) {
                inferiorMedia++;
            }
        }

        /*
        System.out.println("\nDia\tTemperatura");
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("%d\t%.2f\n", i + 1, temp[i]);
        }
        */

        System.out.println("Menor temperatura do ano: " + menor);
        System.out.println("Maior temperatura do ano: " + maior);
        System.out.println("Temperatura média anual: " + media);
        System.out.println("Dias no ano em que a temperatura foi inferior a média anual: " + inferiorMedia);
    }

    public static void E85L() {
        Random random = new Random();
        double tempMin = -5;
        double tempMax = 45;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        ArrayList<Double> temp = new ArrayList<>();

        for (int i = 0; i < 365; i++) {
            temp.add(random.nextDouble(tempMax - tempMin) + tempMin);
            if (temp.get(i) < menor) {
                menor = temp.get(i);
            }
            if (temp.get(i)> maior) {
                maior = temp.get(i);
            }
            soma+= temp.get(i);
        }

        double media = soma/365;
        int inferiorMedia = 0;

        for (Double aDouble : temp) {
            if (aDouble < media) {
                inferiorMedia++;
            }
        }

        /*
        System.out.println("Dia\tTemperatura");
        for (int i = 0; i < temp.size(); i++) {
            System.out.printf("%d\t%.2f\n", i + 1, temp.get(i));
        }
        */

        System.out.println("Menor temperatura do ano: " + menor);
        System.out.println("Maior temperatura do ano: " + maior);
        System.out.println("Temperatura média anual: " + media);
        System.out.println("Dias no ano em que a temperatura foi inferior a média anual: " + inferiorMedia);
    }
}
