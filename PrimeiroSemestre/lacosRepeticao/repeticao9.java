package PrimeiroSemestre.lacosRepeticao;
import java.util.Scanner;

public class repeticao9 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        float n = leia.nextFloat();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        leia.close();
    }
}

// 10 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
