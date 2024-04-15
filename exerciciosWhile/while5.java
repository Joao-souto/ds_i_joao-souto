package exerciciosWhile;

import java.util.Scanner;
import java.util.Arrays;

public class while5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        float numeros[] = new float[10];

        while (i < numeros.length) {
            System.out.println("Insira o valor do número " + (i + 1) + ": ");
            numeros[i] = (float) leia.nextFloat();
            i++;
        }

        float media = media(numeros);
        float maior = maior(numeros);
        float menor = menor(numeros);

        System.out.println("A média destes números é " + media + ".");
        System.out.println("O maior número entre estes números é " + maior + ".");
        System.out.println("O menor destes números é " + menor + ".");
        System.out.println("Sequência organizada: " + Arrays.toString(numeros));

        leia.close();
    }

    public static float media(float[] numeros) {
        int i = 0;
        float soma = 0;

        while (i < numeros.length) {
            soma = soma + numeros[i];
            i++;
        }
        float media = soma / 10;
        return media;
    }

    public static float maior(float[] numeros) {
        float maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static float menor(float[] numeros) {
        float menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}
