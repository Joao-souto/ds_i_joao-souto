package PrimeiroSemestre.lacosRepeticao;
import java.util.Scanner;

public class repeticao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo para que seja calculado o fatorial: ");
        int numero = scanner.nextInt();
        int numero1 = numero;

        for (int i = (numero - 1); i > 0; i--) {
            numero = numero * i;
        }

        System.out.println(numero1 + "!= " + numero);

        scanner.close();
    }
}
// 17 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120