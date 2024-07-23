package PrimeiroSemestre.lacosRepeticao;
import java.util.Scanner;

public class repeticao10 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float n = 0;

        while(n<=0){  
        System.out.println("Insira um valor(positivo): ");
        n = leia.nextFloat();
        }
        
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        leia.close();
    }
}
// 11 - Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.