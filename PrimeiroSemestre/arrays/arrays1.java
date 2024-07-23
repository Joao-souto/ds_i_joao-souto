package PrimeiroSemestre.arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira o valor do número " + (i+1) + ": ");
            array[i] = Scanner.nextInt();
        }
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<menor) {
                menor = array[i];
            }
        }

        System.out.println("O menor valor deste array é " + menor + ".");

        Scanner.close(); 
    }
}
// Faça algoritmo para ler um vetor de 10 valores inteiros e depois identificar e mostrar o menor valor 