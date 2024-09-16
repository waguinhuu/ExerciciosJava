package curso_gustavo_guanabara.orientadaobjetos.orientadaobjetosv2;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual() {
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Dono: " + getDono() );
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Status da conta: " + getStatus());
    }
    public void abrirConta(String tipo){
        //this.tipoConta = tipo;
        this.setTipoConta(tipo);
        this.setStatus(true);
        if(tipo.equals("cc")){
            System.out.println("Conta corrente aberta com sucesso!");
            this.setSaldo(50);
        } else if (tipo.equals("cp")) {
            System.out.println("Conta poupança aberta com sucesso!");
            this.setSaldo(150);
        }else{
            System.out.println("Conta não indentificada.");
        }
    }
    public void fecharConta(){
        if (this.getSaldo() == 0){
            System.out.println("Conta fechada com sucesso.");
        }else if(this.getSaldo() < 0){
            System.out.println("Erro! Conta está em débito.");
        }else {
            System.out.println("Erro! Conta está com saldo.");
        }
    }
    public void depositar(float deposito){
        if(this.getStatus()){
           // this.saldo += deposito;
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito de " + deposito + " realizado. " + this.saldo + " de saldo.");
        }else {
            System.out.println("Conta não aberta.");
        }
    }
    public void sacar(float saque) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque de "+ saque + " realizado com sucesso.");
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Erro! Conta não aberta.");
        }
    }
    public void pagarMensal() {
        if (getStatus()){
            if (this.getTipoConta().equals("cc")) {
                this.setSaldo(this.getSaldo() - 12);
            } else if (this.getTipoConta().equals("cp")) {
                this.setSaldo(this.getSaldo() - 20);
            }
        }else{
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
}
