import java.util.Scanner;
// importação de biblioteca para utilizar "imput"
public class Combustivel{
    public static void main(String[] args){
        
        Scanner escanear = new Scanner(System.in);
        // atribuindo método de scanner a uma variável

        System.out.println("Digite a quantidade de Km/l: ");
        float kml = escanear.nextFloat();

        System.out.println("Digite a distância a ser percorrida(em km): ");
        float distancia = escanear.nextFloat(); 

        System.out.println("Digite o preço unitário do litro do combustível(em reais): ");
        float precoLitro = escanear.nextFloat(); 

        float litrosCombustivel = distancia / kml;
        float precoFinal = litrosCombustivel * precoLitro;

        System.out.println("O custo desse trajeto será " + precoFinal + " reais.");
    }
}