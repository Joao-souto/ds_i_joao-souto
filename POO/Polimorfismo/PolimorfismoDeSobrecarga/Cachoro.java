package POO.Polimorfismo.PolimorfismoDeSobrecarga;

public class Cachoro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("AU Au AU");
    }

    public void reagir(){ // POLIMORFISMO DE SOBRECARGA
        // MÉTODOS COM MESMO NOME, MAS COM ASSINATURAS DIFERENTES'
    }

    public void reagir(String t){
        
    }

    public void reagir(float f){
        
    }
}
