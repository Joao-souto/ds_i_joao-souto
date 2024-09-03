package POO.Polimorfismo;
public class Executavel{
    public static void main (String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

    
        m.setPeso(566f);
        m.setCorPelo("Preto");
        a.locomover();
        m.locomover();
        r.locomover();
        p.locomover();
        // AQUI ESTÁ SENDO APLICADO O POLIMORFISMO DE SOBREPOSIÇÃO, MÉTODOS COM A MESMA ASSINATURA QUE TEM COMPORTAMENTOS DIFERENTES
    }
}