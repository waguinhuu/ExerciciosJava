package exerciciochat.gerenciamento_funcionario;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    public double calcularBonus() {
        switch (this.cargo) {
            case DESENVOLVEDOR:
                return this.salario * 0.10;
            case GERENTE:
                return this.salario * 0.20;
            case ANALISTA:
                return this.salario * 0.15;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return
                "\nNome = " + nome +
                "\nSalário = " + salario +
                "\nCargo = " + cargo.getTexto();
    }
}
