package exerciciochat.gerenciamento_funcionario;

public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario, Cargo.DESENVOLVEDOR);
        this.linguagemPrincipal = linguagemPrincipal;
    }


    @Override
    public String toString() {
        return "\nDesenvolvedor: " +
                super.toString() +
                "\nLinguagem Principal = " + linguagemPrincipal;
    }
}
