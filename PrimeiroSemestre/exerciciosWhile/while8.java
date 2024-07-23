package PrimeiroSemestre.exerciciosWhile;
import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;

        System.out.println("Insira o tamanho do quadrado que deseja: ");
        int tamanhoQuadrado = leia.nextInt();

        while (i < tamanhoQuadrado) {
            String quadrado = repeatString(" X ", tamanhoQuadrado);
            if (i > 0 && i < (tamanhoQuadrado - 1)) {
                quadrado = repeatString("  ", tamanhoQuadrado);
                System.out.println(" X " + quadrado + "X ");
            } else {
                System.out.println(quadrado);
            }
            i++;
        }

        leia.close();
    }

    public static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

}