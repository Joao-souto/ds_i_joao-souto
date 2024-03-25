package exercicios1;
import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Insira sua altura: ");
        float altura = leia.nextFloat();

        System.out.println("Insira seu sexo(M ou F): ");
        String sexo = leia.nextLine();
        sexo = sexo.toLowerCase();

        if(sexo == "m" || sexo == "masculino" ){
            float pesoIdeal = (72.7 * altura) - 58;

            System.out.println("Olá, " + nome + "! Seu peso ideal é " + pesoIdeal + " Kg.");
        }

        else if(sexo == "f" || sexo == "feminino" ){
            float pesoIdeal = (62.1 * altura) - 44.7;

            System.out.println("Olá, " + nome + "! Seu peso ideal é " + pesoIdeal + " Kg.");
        }

        else{
            System.out.println("Insira seu sexo correto!");
        }

        leia.close();
    }
}
