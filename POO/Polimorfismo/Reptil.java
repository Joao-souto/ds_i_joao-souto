package POO.Polimorfismo;

public class Reptil extends Animal{
    private String corEscama;

    public String getcorEscama(){
        return this.corEscama;
    }

    public void setcorEscama(String c){
        this.corEscama = c;
    }

    @Override
    public void locomover(){
        System.out.println("Estou rastejando...");
    };
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais...");
    };
    @Override
    public void emitirSom(){
        System.out.println("Som de reptil...");
    };
}