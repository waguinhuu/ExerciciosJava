package aula11;

public class ProgramaPrinc {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
       /* v1.setNome("Wagner");
        v1.setIdade(19);
        v1.setSexo('M');
        System.out.println(v1.toString()); */

        Aluno a1 = new Aluno();
        a1.setNome("Mario");
        a1.setIdade(32);
        a1.setSexo('M');
        a1.setCurso("Informatica");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        a1.fazerAniv();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Leo");
        b1.setBolsa(12.5f);
        b1.setSexo('M');
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setSalario(2500);
        p1.receberAum(20);

        Tecnico n1 = new Tecnico();
        n1.setNome("Teo");
        n1.praticar();

    }



}
