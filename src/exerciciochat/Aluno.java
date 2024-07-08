package exerciciochat;

public class Aluno extends Pessoa {
    private String matricula;
    private  String curso;

    @Override
    public void exibirInfor() {
        super.exibirInfor();
        System.out.printf("Matricula: %s\n Curso: %s\n", matricula, curso);
    }
    public void fazerProva(){
        System.out.println("O aluno " + getNome() + " está fazendo prova.\n");
    }

    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
