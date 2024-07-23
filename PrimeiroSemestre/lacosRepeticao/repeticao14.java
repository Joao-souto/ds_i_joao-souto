package PrimeiroSemestre.lacosRepeticao;
import java.util.Scanner;

public class repeticao14 {
    
    // Método para calcular a série de Fibonacci até o n-ésimo termo
    public static void fibonacci(int n) {
        int a = 1, b = 1;
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");

        // Se n for 1, apenas imprime o primeiro termo
        if (n >= 1)
            System.out.print(a + " ");

        // Se n for 2, imprime os dois primeiros termos
        if (n >= 2)
            System.out.print(b + " ");

        // Calcula e imprime os termos restantes
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        // Chamando o método para gerar a série de Fibonacci até o n-ésimo termo
        fibonacci(n);
    }
}
// 15 - A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.