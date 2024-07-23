package POO.Encapsulamento;
public interface Controlador{
    // ENCAPSULAR - Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.
    
    // Uma boa cápsula fornece interface.

    // INTERFACE - Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto desta classe.

    // Interface é definida em um arquivo separado e seus métodos abstrados são definidos(mas não irão ser desenvolvidos ali)

    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}