package PrimeiroSemestre.exercicios2;
import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Código	Produto	        Preço Unitário\n100	Cachorro quente	R$ 1,70\n101	Bauru Simples	R$ 2,30\n102	Bauru com ovo	R$ 2,60\n103	Hamburguer	R$ 2,40\n104	Cheeseburguer	R$ 2,50\n105	Refrigerante	R$ 1,00\n\nInsira o código do produto desejado: ");
        int codProduto = leia.nextInt();

        System.out.println("Insira a quantidade: ");
        int quantidade = leia.nextInt();

                switch(codProduto){
            case 100:
                System.out.println("O valor final é " + (1.7 * quantidade) + " reais.");
            break; 
            case 101:
                System.out.println("O valor final é " + (2.3 * quantidade) + " reais.");
            break; 
            case 102:
                System.out.println("O valor final é " + (2.6 * quantidade) + " reais.");
            break; 
            case 103:
                System.out.println("O valor final é " + (2.4 * quantidade) + " reais.");
            break; 
            case 104:
                System.out.println("O valor final é " + (2.5 * quantidade) + " reais.");
            break; 
            case 105:
                System.out.println("O valor final é " + (1 * quantidade) + " reais.");
            break; 
            default:
                System.out.println("Código inválido!");
            break;
        }

        leia.close();
    }
}

