package PrimeiroSemestre.exerciciosWhile;
import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        float numeros[] = new float[10];

        while (i < numeros.length) {
            System.out.println("Insira o valor do número " + (i + 1) + ": ");
            numeros[i] = (float) leia.nextFloat();
            i++;
        }

        float maiores[] = maior(numeros);

        System.out.println("O maior número: " + maiores[0] + ".");
        System.out.println("O segundo maior número: " + maiores[1] + ".");

        leia.close();
    }
    public static float[] maior(float[] numeros) {
        float maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        float maior2 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior2 && numeros[i]<maior) {
                maior2 = numeros[i];
            }
        }

        float maiores[] = {maior, maior2};
        return maiores;
    }
}