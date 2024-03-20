package exercicios1;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores: ");
        int totalEleitores = leia.nextInt();

        System.out.println("Insira o número de votos brancos: ");
        int votosBrancos = leia.nextInt();

        System.out.println("Insira o número de votos nulos: ");
        int votosNulos = leia.nextInt();

        System.out.println("Insira o número de votos válidos: ");
        int votosValidos = leia.nextInt();

        float porcentagemBrancos = votosBrancos * totalEleitores / 100;
        float porcentagemNulos = votosNulos * totalEleitores / 100;
        float porcentagemValidos = votosValidos * totalEleitores / 100;

        System.out.println("De " + totalEleitores + " votos, " + porcentagemBrancos + "% foram brancos, " + porcentagemNulos + "% foram nulos e " + porcentagemValidos + "% foram válidos.");
        
    }
}
