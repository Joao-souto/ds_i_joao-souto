package exerciciosWhile;
import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        float numeros[] = new float[10];

        while (i<numeros.length) {
        System.out.println("Insira o valor do número " + (i+1) + ": ");
        numeros[i] = (float) leia.nextFloat();
        i++;
        }

        leia.close();

        media(numeros);
    }

    public static float media(float[] numeros) {
                int i = 0;
                float soma = 0;
        
                while (i<numeros.length) {
                    soma = soma + numeros[i];
                    i++;
                }

                float media = soma/10;
                System.out.println("A média destes números é " + (soma/10) + ".");
                
                return media;
    }
}

// 5.	Achando o maior número
// Achar o maior, menor, média e organizar números ou sequências são os algoritmos mais importantes e estudados em Computação. Em Java não poderia ser diferente.
// Em nosso curso, obviamente, também não será diferente.

// Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, e ao final
// mostre qual destes números é o maior.
