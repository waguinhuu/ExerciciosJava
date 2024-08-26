package exerciciochat.sistema_biblioteca;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Wagner",19,556);
        Livro livro = new Livro("Harry Potter","L.W","12ee");

        System.out.println(pessoa);
        System.out.println(livro);


        Emprestimo emprestimo = new Emprestimo(pessoa, livro);
        emprestimo.realizarEmprestimo();
        System.out.println(livro);

        emprestimo.realizarDevolucao();
        System.out.println(livro);

        System.out.println(emprestimo);
    }
}
