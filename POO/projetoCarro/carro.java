package POO.projetoCarro;

public class carro {
    // ATRIBUTOS
    String nome;
    String marca;
    int ano;
    int velocidade;

    //  MÉTODOS
    
    public void acelerar(int aceleracao) {
        velocidade+=aceleracao;
    }

    public void freiar(int reduzir) {
        velocidade-=reduzir;
    }

    public void buzinar() {
        System.out.println("BIBI");
    }
}
