package PrimeiroSemestre.exercicios2;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        int nota1 = leia.nextInt();

        System.out.println("Insira sua segunda nota: ");
        int nota2 = leia.nextInt();

        int media = (nota1+nota2)/2;

        //EM CASO ONDE SE TRABALHA COM FLOAT, O IDEAL É USAR O "IF"

        if (media>=0 && media<=4) {
            System.out.println("Sua média é " + media + ". Você foi reprovado!");
        }
        else if(media>4 && media<=7){
            System.out.println("Sua média é " + media + ". Você fará um exame!");
        }
        else if(media>7 && media<=10){
            System.out.println("Sua média é " + media + ". Você foi aprovado!");
        }
        else{
            System.out.println("Insira valores válidos!");
        }

        leia.close();
    }
}
