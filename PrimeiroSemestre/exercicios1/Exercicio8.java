package PrimeiroSemestre.exercicios1;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o custo de fábrica do seu carro(em reais): ");
        float precoFabrica = leia.nextFloat();

        float precoFinal = precoFabrica + (28 * precoFabrica  / 100) + (45 * precoFabrica / 100);

        System.out.println("Considerando o custo percentual do distribuidor e dos impostos o valor final deste carro é " + precoFinal + " reais.");

        leia.close();
    }
} 
