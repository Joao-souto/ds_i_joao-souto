package lacosRepeticao;
import java.util.Scanner;
public class repeticao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String novoCalculo = "s";

        while(novoCalculo.equals("s")){
            System.out.println("Insira dois valores, o primeiro será dividido pelo segundo! \nInsira o primeiro valor: ");
            float valor1 = leia.nextFloat();
    
            System.out.println("Insira o segundo valor: ");
            float valor2 = leia.nextFloat();
    
            while(valor2 == 0){
                System.out.println("VALOR INVÁLIDO!! O segundo valor não pode ser igual a zero, insira novamente: ");
                valor2 = leia.nextFloat();
            }
    
            float resultado = valor1/valor2;
            System.out.println("O resultado desta divisão é " + resultado + ".");
    
            System.out.println("NOVO CÁLCULO(S/N)?");
            novoCalculo = leia.next();
            novoCalculo = novoCalculo.toLowerCase();
        }

            System.out.println("OBRIGADO POR UTILIZAR DESTE PROGRAMA!");

        leia.close();
    }
    
}
// 6 - Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício [5]. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo.