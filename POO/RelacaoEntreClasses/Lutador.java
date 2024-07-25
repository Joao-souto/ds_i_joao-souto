package POO.RelacaoEntreClasses;

public class Lutador{
        private String nome;
        private int id;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

        public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas){
            this.nome = nome;
            this.nacionalidade = nacionalidade;
            this.idade = idade;
            this.altura = altura;
            this.setPeso(peso);
            this.vitorias = vitorias;
            this.empates = empates;
            this.derrotas = derrotas;
        }

        //GETTERS
        public String getNome(){
            return this.nome;
        }
        public int getId(){
            return this.id;            
        }
        public String getNacionalidade(){
            return this.nacionalidade;
        }
        public int getIdade(){
            return this.idade;
        }
        public float getAltura(){
            return this.altura;
        }
        public float getPeso(){
            return this.peso;
        }
        public String getCategoria(){
            return this.categoria;
        }
        public int getVitorias(){
            return this.vitorias;
        }
        public int getDerrotas(){
            return this.derrotas;
        }
        public int getEmpates(){
            return this.empates;
        }

        //SETTERS
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setId(int id){
            this.id = id;
        }
        public void setNacionalidade(String nacionalidade){
            this.nacionalidade = nacionalidade;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setAltura(float altura){
            this.altura = altura;
        }
        public void setPeso(float peso){
            this.peso = peso;
            if(peso<=50 && peso>0){
                this.setCategoria("Leve");
            }
            if(peso>50 && peso<80){
                this.setCategoria("Médio");
            }
            if(peso>=80){
                this.setCategoria("Pesado");
            }
            if(peso<0){
                System.out.println("Peso inválido!");
            }
        }
        public void setCategoria(String categoria){
            this.categoria = categoria;
        }
        public void setVitorias(int vitorias){
            this.vitorias = vitorias;
        }
        public void setDerrotas(int derrotas){
            this.derrotas = derrotas;
        }
        public void setEmpates(int empates){
            this.empates = empates;
        }

        public void ganharLuta(){
            this.setVitorias(this.getVitorias() + 1);
        }
        public void empatarLuta(){
            this.setEmpates(this.getEmpates() + 1);
        }
        public void perderLuta(){
            this.setDerrotas(this.getDerrotas() + 1);
        }

        public void apresentar(){
            System.out.println("------LUTADOR " + this.getId() + "------");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nacionalidade: " + this.getNacionalidade());
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Altura: " + this.getAltura());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("Categoria: " + this.getCategoria());
            System.out.println("Ganhou: " + this.getVitorias());
            System.out.println("Perdeu: " + this.getDerrotas());
            System.out.println("Empatou: " + this.getEmpates());
        }
}