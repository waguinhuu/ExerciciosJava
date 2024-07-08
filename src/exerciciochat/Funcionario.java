package exerciciochat;

public class Funcionario extends Pessoa {
    private String setor;
    private String turno;


    @Override
    public void exibirInfor() {
        super.exibirInfor();
        System.out.printf("Setor: %s\n Turno: %s\n", setor,turno);
    }

    public void executarTarefa(){
        System.out.println("O funcionário " + getNome() + " está executando tarefa no setor  \n" + getSetor());
    }

    public Funcionario(String nome, int idade, String cpf, String setor, String turno) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.turno = turno;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
