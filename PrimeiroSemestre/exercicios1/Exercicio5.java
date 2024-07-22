package exercicios1;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        float idade = leia.nextInt();

        float dias = idade * 365;
        float meses = dias / 30;

        System.out.println("Você têm " + dias + "dias de vida e " + meses + " meses de vida.");

        leia.close();
    }
}
