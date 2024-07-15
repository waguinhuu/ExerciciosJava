package exerciciochat;

public class ProgramaBiblioteca {
    public static void main(String[] args) {

        Livro l1 = new Livro("Harry potter", 2002, "J.K", 245);
        l1.exibirInformacoes();
        l1.emprestar();
        l1.devolver();

        Revista r1 = new Revista("POO",1995,"Java",34);
        r1.exibirInformacoes();
    }
}
