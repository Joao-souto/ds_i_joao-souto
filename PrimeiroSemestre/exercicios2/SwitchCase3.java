package PrimeiroSemestre.exercicios2;
import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o número 1: ");
        float num1 = leia.nextFloat();

        System.out.println("Insira o número 2: ");
        float num2 = leia.nextFloat();

        System.out.println("Insira a operação desejada: \n1- Média\n2- Diferença\n3- Produto\n4- Divisão");
        int operacao = leia.nextInt();

                switch(operacao){
            case 1:
                System.out.println("A média desses dois números resulta em " + (num1+num2)/2 + ".");
            break; 
            case 2:
                System.out.println("A diferença desses dois números resulta em " + (num1 - num2) + ".");
            break; 
            case 3:
                System.out.println("O produto desses dois números resulta em " + (num1 * num2) + ".");
            break; 
            case 4:
                System.out.println("A divisão desses dois números resulta em " + (num1 / num2) + ".");
            break; 

            default:
                System.out.println("Código inválido!");
            break;
        }

        leia.close();
    }
}
