package exerciciochat;

public class ContaIvestidor extends ContaBancaria{
    private String perfilInvestidor; // (Conservador, Moderado, Arrojado)

    public ContaIvestidor(String numeroDaConta, double saldo, String perfilInvestidor) {
        super(numeroDaConta, saldo);
        this.perfilInvestidor = perfilInvestidor;
    }

    public void investir(int valorIvestimento){
        if(this.saldo > valorIvestimento){
            this.saldo-=valorIvestimento;
        }else{
            System.out.println("Saldo insuficiente para esse investimento");
        }
    }

    public String getPerfilInvestidor() {
        return perfilInvestidor;
    }

    public void setPerfilInvestidor(String perfilInvestidor) {
        this.perfilInvestidor = perfilInvestidor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Numero da conta: " + getNumeroDaConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Perfil do investidor: " + getPerfilInvestidor());
    }
}
