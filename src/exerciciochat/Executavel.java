package exerciciochat;

public class Executavel {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Wagner", 19, "123.456.789-00", "1111", "Desenvolvimento de sistemas");
        Professor p1 = new Professor("Carlos", 33,"456.321.567-11",3500, "POO");
        Funcionario f1 = new Funcionario("Mario", 31,"123.456.788-99", "P2","Matutino");

        a1.exibirInfor();
        a1.fazerProva();

        p1.exibirInfor();
        p1.darAula("Herança");

        f1.exibirInfor();
        f1.executarTarefa();
    }
}
