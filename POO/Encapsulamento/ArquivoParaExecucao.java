package POO.Encapsulamento;

public class ArquivoParaExecucao {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();

        controle1.ligar();
        controle1.play();
        controle1.ligarMudo();
        controle1.abrirMenu();
    }
}
