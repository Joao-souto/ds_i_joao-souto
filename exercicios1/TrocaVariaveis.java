package exercicios1;
public class TrocaVariaveis{
    public static void main(String[] args){
        int numero1 = 3;        
        int numero2 = 9;        
        int auxiliar;  

        System.out.println("Número 1 é " + numero1 + ".");
        System.out.println("Número 2 é " + numero2 + ".");

        auxiliar = numero1;
        numero1 = numero2;      
        numero2 = auxiliar;

        System.out.println("Após a troca, número 1 passa a ser " + numero1 + ".");      
        System.out.println("Após a troca, número 2 passa a ser " + numero2 + ".");      
    }
}