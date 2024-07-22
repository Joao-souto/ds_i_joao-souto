package lacosRepeticao;
import java.util.Scanner;

public class repeticao17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        float numeros[] = new float[10];

        while (i < numeros.length) {
            System.out.println("Insira o valor do número " + (i + 1) + ": ");
            numeros[i] = (float) leia.nextFloat();
            i++;
        }

        float soma = soma(numeros);
        float maior = maior(numeros);
        float menor = menor(numeros);

        System.out.println("A soma destes números é " + soma + ".");
        System.out.println("O maior número entre estes números é " + maior + ".");
        System.out.println("O menor destes números é " + menor + ".");

        leia.close();
    }

    public static float soma(float[] numeros) {
        int i = 0;
        float soma = 0;
        while (i < numeros.length) {
            soma = soma + numeros[i];
            i++;
        }
        return soma;
    }

    public static float maior(float[] numeros) {
        float maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static float menor(float[] numeros) {
        float menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}


// 18 - Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.