package curso_gustavo_guanabara.orientadaobjetos;

public class Aula {
    String conteudo;
    String inicio;
    String fim;
    String professor;
    String aluno;
    boolean comecou;


    void status(){
        System.out.println("A aula começa as " + this.inicio);
        System.out.println("Termina as " + this.fim);
        System.out.println("Conteudo: " + this.conteudo);
        System.out.println("Com o professor " + this.professor);
        System.out.println("e o aluno " + this.aluno);

    }
    void iniciar(){
        if(this.comecou == true){
            System.out.println( this.professor + " iniciou a aula.");
        }else {
            System.out.println("Aguarde o professor.");
        }

    }

    void comeco(){
        this.comecou = true;
    }
    void termino(){
        this.comecou = false;
    }
}
