package lacosRepeticao;
import java.util.Scanner;
public class repeticao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira dois valores, o primeiro será dividido pelo segundo! /n Insira o primeiro valor: ");
        float valor1 = leia.nextFloat();

        leia.close();
    }
    
}
// 1 - Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 