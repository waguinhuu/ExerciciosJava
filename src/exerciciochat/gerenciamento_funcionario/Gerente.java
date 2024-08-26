package exerciciochat.gerenciamento_funcionario;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario, Cargo.GERENTE);
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "\nGerente: " +
                super.toString() +
                "\nDepartamento = " + departamento;
    }
}
