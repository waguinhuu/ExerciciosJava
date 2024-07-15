package exerciciochat;

public class ProgramaContaBancaria {
    public static void main(String[] args) {

      ContaCorrente cc = new ContaCorrente("1234-00", 2500, 1000);
        cc.depositar(500);
        cc.sacar(90);
        cc.exibirDetalhes();

        ContaPoupanca cp = new ContaPoupanca("4567-99", 100,0.3f);
        cp.aplicarRendimento();
        cp.exibirDetalhes();

        ContaIvestidor ci = new ContaIvestidor("9090-00", 3400,"Arrojado");
        ci.investir(400);
        ci.exibirDetalhes();
    }
}
