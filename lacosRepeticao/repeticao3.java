package lacosRepeticao;
import java.util.Scanner;
public class repeticao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira dois valores, o primeiro será dividido pelo segundo! /n Insira o primeiro valor: ");
        float valor1 = leia.nextFloat();

        System.out.println("Insira o segundo valor: ");
        float valor2 = leia.nextFloat();

        while(valor2 == 0){
            System.out.println("VALOR INVÁLIDO!! O segundo valor não pode ser igual a zero, insira novamente: ");
            valor2 = leia.nextFloat();
        }

        float resultado = valor1/valor2;
        System.out.println("O resultado desta divisão é " + resultado + ".");

        leia.close();
    }
    
}