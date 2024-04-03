package exercicios2;
import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o número 1: ");
        float num1 = leia.nextFloat();

        System.out.println("Insira o número 2: ");
        float num2 = leia.nextFloat();

        System.out.println("Insira a operação desejada: \n1- Média\n2- Diferença\n3- Produto\n4- Divisão");
        float operacao = leia.nextInt();

        leia.close();
    }
}
