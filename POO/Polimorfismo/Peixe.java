package POO.Polimorfismo;

public class Peixe extends Animal{
    private String corPeixe;

    public String getcorPeixe(){
        return this.corPeixe;
    }

    public void setcorPeixe(String c){
        this.corPeixe = c;
    }

    @Override
    public void locomover(){
        System.out.println("Estou nadando...");
    };
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias...");
    };
    @Override
    public void emitirSom(){
        System.out.println("Som peixe...");
    };
}