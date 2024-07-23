package PrimeiroSemestre.arrays;
import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira o valor do índice " + i + " deste array: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }        

        for (int i = 0; i < array.length; i++) {
            System.out.println("Após a troca, o valor do índice " + i + " do mesmo array passa a ser " + array[i] + ".");
        }

        scanner.close();
    }
}
// Faça um algoritmo que inverta a posição dos valores de um vetor de seis posições de inteiros  

// Neste algoritmo a lógica é usar uma variável auxiliar para a troca (veja exercício da troca do valor de duas variáveis) e achar uma expressão matemática para referenciar o elemento da posição simétrica, onde será feita a troca  

// Para a troca, basta percorrermos a metade do vetor e usarmos a variável auxiliar e a expressão encontrada no passo anterior 