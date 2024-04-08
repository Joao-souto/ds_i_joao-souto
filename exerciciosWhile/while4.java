package exerciciosWhile;
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

// 4.	Programa em Java que calcula a média das notas de uma turma
// Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
// Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

// Por fim, o programa mostra a média, aritmética, da turma.
