package exerciciosWhile;
import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;

        System.out.println("Insira o tamanho do quadrado que deseja: ");
        int tamanhoQuadrado = leia.nextInt();

        while (i<tamanhoQuadrado) {
            String quadrado = repeatString(" X ", tamanhoQuadrado);
            System.out.println(quadrado);
         i++;
        }

        leia.close();
    }   
    
    public static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(); // criação de objeto para armazenar a string, StringBuilder é uma classe em Java que permite a criação e manipulação eficiente de strings mutáveis. 
        for (int i = 0; i < count; i++) {
            sb.append(str); // atribiuição de string ao objeto
        }
        return sb.toString();
    }

}