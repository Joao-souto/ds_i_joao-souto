package POO.Heranca.HerancaPt2;

public abstract class Pessoa {
    private String nome;
    private String sexo;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
    }
}
