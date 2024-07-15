package exerciciochat;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroDaConta, double saldo, double limiteChequeEspecial) {
        super(numeroDaConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    @Override
    public void sacar(int valor) {
        if(valor > 0 && (this.saldo + this.limiteChequeEspecial) >= valor){
            this.saldo -= valor;
            System.out.println(valor + " reais sacado com sucesso");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Número da conta: " + getNumeroDaConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite do cheque especial: " + getLimiteChequeEspecial());
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
