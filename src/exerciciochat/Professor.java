package exerciciochat;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;


    @Override
    public void exibirInfor() {
        super.exibirInfor();
        System.out.printf("Salario: %.2f\n Disciplina: %s\n", salario, disciplina);
    }

    public void darAula(String conteudo){
        System.out.printf("O professor %s está dando aula da disciplina %s, com o conteúdo de %s\n\n", getNome(), disciplina, conteudo);
    }

    public Professor(String nome, int idade, String cpf, double salario, String disciplina) {
        super(nome, idade, cpf);
        this.setSalario(salario);
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if (this.getSalario() <= 1500){
            System.out.println("Salário de merda em professor kkkkkk");
        }

    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
