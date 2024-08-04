package POO.Exercicio;

public class Run {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João Souto", "M", 17);
        p[1] = new Pessoa("Carlos Souto", "M", 19);

        l[0] = new Livro("Pequeno Príncipe", "Silvio Santos", 100, p[0]);
        l[1] = new Livro("Grande Príncipe", "Faustão Silva Santos", 300, p[1]);

        l[0].abrir();
        l[0].folhear(50);
        l[0].avancarPag();;
        l[0].detalhes();
    }
}
