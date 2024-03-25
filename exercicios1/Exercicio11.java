package exercicios1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float precoTotal;

        System.out.println("Insira o número de litros vendidos: ");
        float litrosVendidos = leia.nextFloat();

        System.out.println("Insira o código do combustível (A para álcool e G para gasolina): ");
        String codCombustivel = leia.next();
        codCombustivel = codCombustivel.toLowerCase();

        switch (codCombustivel) {
            case "a":
                if (litrosVendidos <= 20) {
                    precoTotal = (float) ((2.9 - (3 * 2.9 / 100)) * litrosVendidos);

                    System.out.println("Preço total de " + litrosVendidos + " de álcool é " + precoTotal + " reais.");
                }

                else if (litrosVendidos > 20) {
                    precoTotal = (float) ((2.9 - (5 * 2.9 / 100)) * litrosVendidos);

                    System.out.println("Preço total de " + litrosVendidos + " de álcool é " + precoTotal + " reais.");
                }
                break;

            case "g":
                if (litrosVendidos <= 20) {
                    precoTotal = (float) ((2.9 - (4 * 3.3 / 100)) * litrosVendidos);

                    System.out.println("Preço total de " + litrosVendidos + " de gasolina é " + precoTotal + " reais.");
                }

                else if (litrosVendidos > 20) {
                    precoTotal = (float) ((2.9 - (6 * 3.3 / 100)) * litrosVendidos);

                    System.out.println("Preço total de " + litrosVendidos + " de gasolina é " + precoTotal + " reais.");
                }
                break;

            default:
                System.out.println("Insira o código correto!");
                break;
        }

        leia.close();

    }
}
