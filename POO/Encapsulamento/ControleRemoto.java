package POO.Encapsulamento;
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume(){
        return this.volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // MÉTODOS ABSTRATOS

    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i=0;i<=this.getVolume();i+=10){
            System.out.println("[]");
        }
    }
    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume(){

    }
    @Override
    public void menosVolume(){

    }
    @Override
    public void ligarMudo(){

    }
    @Override
    public void desligarMudo(){


    }
    @Override
    public void play(){

    }
    @Override
    public void pause(){

    }
}