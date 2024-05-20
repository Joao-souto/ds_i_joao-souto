package POO.IntroducaoPOO.aula02;

public class UtilizandoConstrutor {
    public static void main(String[] args) {
        // Utilizando o método construtor, é mais fácil passar os valores para os atributos
        Caneta caneta1 = new Caneta("Azul", "BIC", 0.5f);
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
    }
}
