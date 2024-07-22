package POO.IntroducaoPOO.aula02;

public class Caneta {
    public String cor;
    public String marca;
    private float ponta;
    private boolean tampada;

    // método construtor
    public Caneta(String c, String m, float p){
        cor = c;
        marca = m;
        ponta = p;
    }

    // getters e setters

    public float getPonta(){
        return this.ponta;
    }

    public float setPonta(float valor){
        return this.ponta = valor;
    }

    // restante dos métodos
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println(cor);
        System.out.println(marca);
        System.out.println(ponta);
        System.out.println(tampada);
    }

    public boolean tampar(){
        return this.tampada = true;
    }

    public boolean destampar(){
        return this.tampada = false;
    }

    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("\nA caneta precisa estar destampada!!");
        }else{
            System.out.println("\nrabiscando...");
        }
    }
}
