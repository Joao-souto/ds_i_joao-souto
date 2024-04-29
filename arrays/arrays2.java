package arrays;
import java.util.Scanner;
public class arrays2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira o valor do índice " + i + " deste array: ");
            array[i] = Scanner.nextInt();
        }
        System.out.println("Insira o valor que você procura no array: ");
        int consulta = Scanner.nextInt();
        boolean verificado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == consulta) {
                System.out.println("O valor" + consulta + " está no índice " + i + " do array.");
                verificado = true;
            }
        }

        if (verificado == false) {
            System.out.println("Este valor não consta no array!");
        }

        Scanner.close(); 
    }
}
// Altere o algoritmo anterior para procurar um número digitado pelo usuário, informando a sua posição, se ele constar no vetor 