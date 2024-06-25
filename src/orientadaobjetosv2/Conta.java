package orientadaobjetosv2;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.numConta = 12345;
        this.dono = "Wagner Silva";
        this.saldo = 0;
        this.status = false;
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
        this.saldo += saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void valores() {
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Dono: " + getDono() );
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Status da conta: " + getStatus());
    }
    public void abrirConta(String tipo){
        this.tipoConta = tipo;
        setStatus(true);
        if(this.tipoConta.equals("cc")){
            System.out.println("Conta corrente aberta com sucesso!");
            this.saldo = 50;
        } else if (this.tipoConta.equals("cp")) {
            System.out.println("Conta poupança aberta com sucesso!");
            this.saldo = 150;
        }
    }
    public void fecharConta(){
        if (this.saldo == 0){
            System.out.println("Conta fechada com sucesso.");
        }else if(this.saldo < 0){
            System.out.println("Erro! Conta está negativada.");
        }else {
            System.out.println("Erro! Conta está com saldo.");
        }
    }
    public void depositar(double deposito){
        if(this.status == true){
            this.saldo += deposito;
            System.out.println("Deposito de " + deposito + " realizado. " + this.saldo + " de saldo.");
        }else {
            System.out.println("Conta inativa.");
        }
    }
    public double sacar(double saque){
        if(this.saldo > 0 || this.saldo >= saque){
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Erro! Saldo insuficiente.");
        }
        return saque;
    }
    public void pagarMensal(){
        if(this.tipoConta.equals("cc")){
            this.saldo -= 12;
        }else if(this.tipoConta.equals("cp")){
            this.saldo -= 20;
        }
    }
}
