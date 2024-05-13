package POO.projetoCarro;
import java.util.Scanner;
public class intancioandoCarro {
    public static void main(String[] args) {
        // INSTANCIAR CLASSE CARRO
        carro car = new carro();
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o nome do seu carro: ");
        car.nome = leia.nextLine(); // atribuindo um valor ao atributo da classe carro de forma variável

        System.out.println("Insira a marca do seu carro: ");
        car.marca = leia.nextLine();

        System.out.println("Insira o ano do seu carro: ");
        car.ano = leia.nextInt();

        System.out.println("Insira o valor da aceleração deste carro(em Km/h): ");
        car.acelerar(leia.nextInt());

        if (car.velocidade>0) {
            System.out.println("O "+ car.nome + " está acelerando na velocidade de " + car.velocidade + " Km/h.");
        }
        if(car.velocidade < 0){
            System.out.println("O "+ car.nome + " está em marcha ré.");
        }
        if (car.velocidade == 0){
            System.out.println("O "+ car.nome + " está parado.");
  
        }
        leia.close();
    }
}
