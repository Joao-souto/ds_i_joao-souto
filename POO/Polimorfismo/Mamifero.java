package POO.Polimorfismo;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String c){
        this.corPelo = c;
    }

    @Override
    public  void locomover(){
        System.out.println("Estou correndo...");
    };
    @Override
    public  void alimentar(){
        System.out.println("Mamando...");
    };
    @Override
    public  void emitirSom(){
        System.out.println("Som mamífero...");
    };
}