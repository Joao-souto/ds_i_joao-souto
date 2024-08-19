package POO.Heranca.HerancaPt2;

public class Executavel{
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); Pessoa não pode ser instanciada por ser uma classe abstrata
        Visitante v1 = new Visitante(); // Visitante pode, e herda as caracteristicas de pessoas por ser uma classe filha
        v1.setNome("Juninho");
        v1.setIdade(18);
        v1.setSexo("Macho");
        System.out.println(v1.toString()); // Mesmo que não tenha nada escrito na classe visitante podemos utilizar todos os métodos de Pessoa.java, isso se chama herança pobre/herança de implementação

         // Aluno tem tudo que a classe Pessoa.java tem + Aluno.java, isso se chama Herança pra diferença
        Aluno a1 = new Aluno(); // Aluno.java é uma especialização de Pessoa.java e Pessoa.java é uma generealização de Aluno.java
        a1.setNome("Cláudio");
        a1.setMatricula(1);
        a1.setCurso("Desenvolvimento de Sistemas");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista(); // Só é possível utilizar a classe bolsista extendendo aluno pois não foi definido como uma classe final
        b1.setNome("Cleber");
        b1.setIdade(17);
        b1.setSexo("Masculino");
        b1.setBolsa(123.7f);
        b1.pagarMensalidade(); // Método sobreposto, só é possível sobrepor um método caso a classe mãe não tenha estabelecido o método como "final"
    }
}
