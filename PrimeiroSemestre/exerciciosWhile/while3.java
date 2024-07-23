package PrimeiroSemestre.exerciciosWhile;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um número inteiro qualquer: ");
        int numero = leia.nextInt();

        int i = 1;
        System.out.println("Números impares até o número " + numero + ": ");
        while (i<numero) {
            System.out.println(i);
            i = i + 2;
        }

        i = 0;
        System.out.println("Números pares até o número " + numero + ": ");
        while (i<numero) {
            System.out.println(i);
            i = i + 2;
        }

        leia.close();
    }
}