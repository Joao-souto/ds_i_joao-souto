package exercicios1;
import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor do seu salário: ");
        float salario = leia.nextFloat();

        System.out.println("Insira a quantidade de carros vendidos: ");
        float numeroCarros = leia.nextFloat();

        System.out.println("Insira o valor da sua comissão por carro vendido: ");
        float comissaoCarro = leia.nextFloat();

        System.out.println("Insira o valor total das suas vendas desse mês: ");
        float totalVendas = leia.nextFloat();

        float salarioFinal = salario +  (comissaoCarro * numeroCarros) + (totalVendas * 5 / 100);

        System.out.println("Seu salário total será de " + salarioFinal + " reais.");
    }
}
