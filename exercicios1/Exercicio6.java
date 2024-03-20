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

        float porcentagemBrancos = votosBrancos * 100 / totalEleitores;
        float porcentagemNulos = votosNulos * 100 / totalEleitores;
        float porcentagemValidos = votosValidos * 100 / totalEleitores;

        System.out.println("De " + totalEleitores + " votos, " + porcentagemBrancos + "% foram brancos, " + porcentagemNulos + "% foram nulos e " + porcentagemValidos + "% foram válidos.");
        
    }
}
