package curso_gustavo_guanabara.aula10;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo('M');
        p2.setSexo('F');
        p3.setSexo('M');
        p4.setSexo('F');

        p1.setIdade(23);
        p2.setIdade(19);
        p3.setIdade(21);
        p4.setIdade(18);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p2.setCurso("Desenvolvedor");
        p3.setSalario(2500.00f);
        p4.setSetor("Estoque");

        p2.cancelarMatr();
        p3.receberAum(500.34f);
        p4.mudarTrabalho();
    }
}
