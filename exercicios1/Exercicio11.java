package exercicios1;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o número de litros vendidos: ");
        float litrosVendidos = leia.nextFloat();

        System.out.println("Insira o código do combustível (A para álcool e G para gasolina): ");
        String codCombustivel = leia.next();
        codCombustivel = codCombustivel.toLowerCase();

        switch (codCombustivel) {
            case "a":
                
            break;

            case "g":
                
            break;
        
            default:
                System.out.println("Insira o código correto!");
            break;
        }

        leia.close();

    }
}
