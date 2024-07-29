package POO.RelacaoEntreClasses;

import java.util.Scanner;

public class ArquivoParaExecucao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Lutador lutadores[] = new Lutador[5];

        String nome;
        String nacionalidade;
        int idade;
        double altura;
        double peso;
        int vitorias;
        int derrotas;
        int empates;

        for (int i = 0; i < lutadores.length; i++) {
            System.out.println("");
            System.out.println("Insira o nome do seu lutador: ");
            nome = leia.next();
                       
            System.out.println("Insira a idade: ");
            idade = leia.nextInt();

            System.out.println("Insira a nacionalidade: ");
            nacionalidade = leia.next();

            System.out.println("Insira a altura: ");
            altura = leia.nextDouble();

            System.out.println("Insira o peso: ");
            peso = leia.nextDouble();

            System.out.println("Insira a quantidade de vitórias: ");
            vitorias = leia.nextInt();

            System.out.println("Insira a quantidade de derrotas: ");
            derrotas = leia.nextInt();

            System.out.println("Insira a quantidade de empates: ");
            empates = leia.nextInt();

            lutadores[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, empates, derrotas);
            lutadores[i].setId(i+1);
        }
        leia.close();

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].apresentar();
        }
    }
}