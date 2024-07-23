package PrimeiroSemestre.lacosRepeticao;
import java.util.Scanner;

public class repeticao12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um valor(entre 1 e 10): ");
        int valor = leia.nextInt();
        while(valor<=0 || valor>10){  
        System.out.println("Insira um valor(entre 1 e 10): ");
        valor = leia.nextInt();
        }
        
        for(int i=1;i<11;i++){
            System.out.println(i*valor);
        }

        leia.close();
    }
}

// 13 - Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.