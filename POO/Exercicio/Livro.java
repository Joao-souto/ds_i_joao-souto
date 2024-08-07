package POO.Exercicio;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas , Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("------LIVRO------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totalPag);
        System.out.println("Página atual: " + this.pagAtual);
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    @Override
    public void abrir(){
        this.setAberto(true);
    };
    @Override
    public void fechar(){
        this.setAberto(false);
    };
    @Override
    public void folhear(int numPag){
        if (numPag<=this.getTotalPag() && numPag>=0) {
            this.setPagAtual(numPag);
        }
        else{
            System.out.println("Número solicitado incorreto!");
        }
    };
    @Override
    public void avancarPag(){
        this.setPagAtual(this.getPagAtual()+1);
    };
    @Override
    public void voltarPag(){
        this.setPagAtual(this.getPagAtual()-1);
    };

    // GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
