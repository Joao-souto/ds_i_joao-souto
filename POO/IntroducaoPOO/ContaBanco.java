package POO.IntroducaoPOO;

public class ContaBanco{
    public int numConta;
    protected String tipoConta;
    private String titular;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipoConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Ativa: " + getStatus());
        System.out.println("Saldo: " + getSaldo());
    }

    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void abrirConta(String tc , String nome){
        this.setStatus(true);
        this.tipoConta = tc;
        this.titular = nome;
        if (tc.equals("cc")){
            this.setSaldo(50);
        }
        else if(tc.equals("cp")){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("ERRO! Retire o valor da conta antes de encerrar!!");
        }
        else if(this.getSaldo() < 0){
            System.out.println("ERRO! Acerte o débito da conta antes de encerrar!!");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta encerrada.");
        }
    }

    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getTitular() + ".");
        }
        else{
            System.out.println("Impossível depositar em uma conta inativa!");
        }
    }

    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado no valor de " + v + " reais. Saldo disponível: " + this.getSaldo() + ".");
            }
            else{
                System.out.println("Impossível sacar o valor de " + v + " reais pois o saldo disponível é " + this.getSaldo() + " reais.");
            }
        }
        else{
            System.out.println("Impossível sacar de uma conta inativa!");
        }
    }

    public void pagarMensal(){
        int v = 0;
        String tipo = this.getTipoConta();
        if(tipo.equals("cc")){
            v = 12;
        }
        else if(tipo.equals("cp")){
            v = 20;
        }
        if(getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
        }
        else if(getStatus() == false){
            System.out.println("Conta inativa!");  
        }
    }

    // getters and setters
    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setTipoConta(String n){
        this.tipoConta = n;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setTitular(String n){
        this.titular = n;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(float n){
        this.saldo = n;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setStatus(boolean n){
        this.status = n;
    }

    public boolean getStatus(){
        return status;
    }
}