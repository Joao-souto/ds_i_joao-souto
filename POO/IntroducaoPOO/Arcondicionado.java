package POO.IntroducaoPOO;
// Criação de classe
public class Arcondicionado { 
    // Criação de atributos definindo sua visibilidade
    private float temperatura; 
    private boolean ligado;
    public String marca;
    public String cor;

    // Criação de métodos simples
    public boolean ligar(){
        this.ligado = true;
        return ligado;
    }

    public boolean desligar(){
        this.ligado = false;
        return ligado;
    }

    public void status(){
        System.out.println("\nSOBRE O AR CONDICIONADO:");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Está ligao? " + ligado);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }

    // Criação de getters e setters

    public float getTemperatura(){
        return this.temperatura;
    }
    public float setTemperatura(float valor){
        return this.temperatura = valor;
    }

}
