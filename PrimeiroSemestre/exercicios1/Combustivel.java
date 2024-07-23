package PrimeiroSemestre.exercicios1;
import java.util.Scanner;
// importação de biblioteca para utilizar "imput"
public class Combustivel{
    public static void main(String[] args){
        
        Scanner recebe = new Scanner(System.in);
        // atribuindo método de scanner a uma variável

        System.out.println("Digite a quantidade de Km/l: ");
        float kml = recebe.nextFloat();

        System.out.println("Digite a distância a ser percorrida(em km): ");
        float distancia = recebe.nextFloat(); 

        System.out.println("Digite o preço unitário do litro do combustível(em reais): ");
        float precoLitro = recebe.nextFloat(); 
        // variaveis recebendo valores


        float litrosCombustivel = distancia / kml;
        float precoFinal = litrosCombustivel * precoLitro;
        // cálculo feito

        System.out.println("O custo desse trajeto será " + precoFinal + " reais.");

        recebe.close();
        // indica que "recebe" fecha, questão de segurança para não receber nenhum valor após finalização do programa
    }
}