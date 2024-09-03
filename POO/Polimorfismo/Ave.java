package POO.Polimorfismo;

public class Ave extends Animal{
    private String corAve;

    public String getcorAve(){
        return this.corAve;
    }

    public void setcorAve(String c){
        this.corAve = c;
    }

    @Override
    public void locomover(){
        System.out.println("Estou voando...");
    };
    @Override
    public void alimentar(){
        System.out.println("Bicando...");
    };
    @Override
    public void emitirSom(){
        System.out.println("Som Ave...");
    };
}