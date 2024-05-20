package POO.IntroducaoPOO;

public class GettersAndSetters {
    // getters e setters são métodos utilizados para acessar(get) ou alterar/atribuir(set) valores de um atributo de determinado objeto, sem alterar a classe
    // O acesso e alteração dessa forma garante uma maior segurança do código

    public static void main(String[] args) {
        Arcondicionado objeto1 = new Arcondicionado();
        objeto1.ligar();
        objeto1.cor = "Azul";
        objeto1.marca = "LG";
        objeto1.setTemperatura(19); // atribuindo valor para o atributo temperatura do objeto 1 através do método getTemperatura();
        objeto1.status();

        // Instanciando um segundo objeto
        Arcondicionado objeto2 = new Arcondicionado();
        objeto2.status(); // objeto com valores nulos
    }
}
