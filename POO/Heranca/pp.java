package POO.Heranca;

public class pp {
    // Programa principal
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
    
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p1.setIdade(17);
        p2.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informárica avançada");
        p3.setEspecialidade("Informatica");
        p3.setSalario(5000);
        p3.receberAumento(200);
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
