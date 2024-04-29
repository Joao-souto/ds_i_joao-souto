package arrays;
import java.util.Scanner;
public class arrays2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira o valor do número " + (i+1) + ": ");
            array[i] = Scanner.nextInt();
        }
        System.out.println("");
        int consulta;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<menor) {
                menor = array[i];
            }
        }


        Scanner.close(); 
    }
}
// Altere o algoritmo anterior para procurar um número digitado pelo usuário, informando a sua posição, se ele constar no vetor 