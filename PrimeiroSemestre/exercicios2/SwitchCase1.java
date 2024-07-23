package PrimeiroSemestre.exercicios2;
import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o código do produto: ");
        int codProduto = leia.nextInt();

        switch(codProduto){
            case 1:
                System.out.println("Alimento não-perecível");
            break; 

            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
            break; 

            case 5:
            case 6:
                System.out.println("Vestuário");
            break; 

            case 7:
                System.out.println("Higiene pessoal");
            break; 

            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e Utensílios Domésticos");
            break;  

            default:
                System.out.println("Código inválido!");
            break;
        }

        leia.close();

    }
}
