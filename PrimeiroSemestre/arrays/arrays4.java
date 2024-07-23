package PrimeiroSemestre.arrays;
import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Insira o valor da matriz[" + j + "][" + i + "]: ");
                matriz[j][i] = Scanner.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[j][i]<menor) {
                    menor = matriz[j][i];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[j][i]>maior) {
                    maior = matriz[j][i];
                }
            }
        }

        System.out.println("O maior valor armazenado nesta matriz é " + maior + " e o menor é "+ menor + ".");

        Scanner.close(); 
    }
}
// Crie um algoritmo que crie uma matriz 4 x 4 de inteiros, solicite os valores ao usuário e depois mostre qual o maior e menor valor na matriz  

// Este algoritmo é similar aos exercícios 1 e 2 de vetores, sendo que para preencher e percorrer a matriz precisaremos de duas estruturas PARA (uma para as linhas e outra para as colunas da matriz)  