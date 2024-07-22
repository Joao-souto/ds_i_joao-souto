package exercicios1;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o que será exibido: ");
        String print = teclado.next();

        System.out.println(print);

        teclado.close();
    }
}
