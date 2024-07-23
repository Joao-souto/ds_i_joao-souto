package PrimeiroSemestre.exercicios1;
import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor do seu salário: ");
        float salario = leia.nextFloat();

        System.out.println("Insira o percentual de reajuste: ");
        float porcentagemReajuste = leia.nextFloat();

        float salarioAjustado = (salario * porcentagemReajuste / 100) + salario;

        System.out.println("Seu salário após o reajuste passa a ser " + salarioAjustado + " reais.");

        leia.close();
    }
}
