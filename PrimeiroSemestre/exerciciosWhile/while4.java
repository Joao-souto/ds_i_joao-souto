package PrimeiroSemestre.exerciciosWhile;
import java.util.Scanner;
public class while4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos desta sala: ");
        int quantidadeAlunos = leia.nextInt();
        int i = 1;
        float soma = 0;
        float notas;

        while (i<=quantidadeAlunos) {
            System.out.println("Insira a nota do aluno " + i + ": ");
            notas = leia.nextFloat();
            soma = soma + notas;
            i++;
        }

        System.out.println("A média desta sala é: " + (soma/quantidadeAlunos) + ".");

        leia.close();
    }
}
