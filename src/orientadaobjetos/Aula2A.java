package orientadaobjetos;

public class Aula2A {
    public static void main(String[] args) {
        Aula av1 = new Aula();
        av1.inicio = "7:30";
        av1.fim = "11:30";
        av1.conteudo = "POO";
        av1.professor = "Gustavo Guanabara";
        av1.aluno = "Wagner Silva";
        av1.comecou = false;

        av1.status();
        av1.comeco();
        av1.iniciar();

        Aula av2 = new Aula();
        av2.inicio = "11:30";
        av2.fim = "16:30";
        av2.conteudo = "POO";
        av2.professor = "Gustavo";
        av2.aluno = "Leo Silva";
        av2.comecou = false;

        av2.status();
        av2.termino();
        av2.iniciar();
    }
}
