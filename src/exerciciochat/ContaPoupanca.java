package exerciciochat;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String numeroDaConta, double saldo, double taxaRendimento) {
        super(numeroDaConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Poupança");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.printf("Saldo: %.2f" , getSaldo());
        System.out.printf("Taxa de Rendimento: %.2f\n", getTaxaRendimento());
    }

    public void aplicarRendimento(){
        double rendimento = this.saldo * this.taxaRendimento;
        this.saldo+=rendimento;
        System.out.printf("Rendimento de %.2f aplicado com sucesso\n", rendimento);


    }
}
