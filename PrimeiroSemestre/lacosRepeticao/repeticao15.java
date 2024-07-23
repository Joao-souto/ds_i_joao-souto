package PrimeiroSemestre.lacosRepeticao;

public class repeticao15 {
    public static void main(String[] args) {
        int a = 1, b = 1, n = 500;
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");

        if (n >= 1)
            System.out.print(a + " ");

        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
// 16 - A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.