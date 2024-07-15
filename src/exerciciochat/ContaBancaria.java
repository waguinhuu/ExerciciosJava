package exerciciochat;

public abstract class ContaBancaria {
    protected String numeroDaConta;
    protected double saldo;


    public abstract void exibirDetalhes();

    public void depositar(int valor){
        this.saldo+=valor;
        System.out.println(valor + " reais depositado com sucesso");
    }
    public void sacar(int valor){
        if(this.saldo > valor){
            this.saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente para esse saque");
        }
    }

    public ContaBancaria(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
