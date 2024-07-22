package arrays;
import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Insira o valor da matriz[" + j + "][" + i + "]: ");
                matriz[j][i] = Scanner.nextInt();
            }
        }

        System.out.println("Insira o valor procurado na matriz: ");
        int valorProcurado = Scanner.nextInt();
        boolean valorEncontrado = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (valorProcurado == matriz[j][i]) {
                    valorEncontrado = true;
                    System.out.println("O valor procurado(" + valorProcurado + ") se encontra em matriz[" + j + "][" + i + "].");
                }
            }
        }

        if (valorEncontrado == false) {
            System.out.println("Este valor não existe na matriz!!");
        }

        Scanner.close(); 
    }
}
// Altere o algoritmo anterior para procurar na matriz um valor digitado 