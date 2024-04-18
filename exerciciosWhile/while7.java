package exerciciosWhile;
import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o tamanho do quadrado que deseja: ");
        int quadrado = leia.nextInt();

        leia.close();
    }

}
// 7.	Quadrado de asteriscos

// Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.

// Para lado igual a 5:

// *****
// *****
// *****
// *****
// *****
