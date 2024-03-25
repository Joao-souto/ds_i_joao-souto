package exercicios1;
import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Insira sua altura(em metros): ");
        float altura = leia.nextFloat();

        System.out.println("Insira seu sexo(M ou F): ");
        String sexo = leia.next();
        sexo = sexo.toLowerCase();

        // No Java, para comparar strings, você deve usar o método equals() em vez do operador ==.
        // O operador == compara referências de objetos, não seus valores.
        if(sexo.equals("m") || sexo.equals("masculino") ){
            float pesoIdeal = (float) ((72.7 * altura) - 58);

            System.out.println("Olá, " + nome + "! Seu peso ideal é " + pesoIdeal + " Kg.");
        }
        else if(sexo.equals("f") || sexo.equals("feminino") ){
            float pesoIdeal = (float) ((62.1 * altura) - 44.7);

            System.out.println("Olá, " + nome + "! Seu peso ideal é " + pesoIdeal + " Kg.");
        }

        leia.close();
    }
}