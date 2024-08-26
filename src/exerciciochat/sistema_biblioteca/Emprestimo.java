package exerciciochat.sistema_biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
    }

    public void realizarEmprestimo(){
        if (livro.isDisponivel()){
            livro.setDisponivel(false);

            System.out.println("Emprestimo realizado com sucesso!");
        }else {
            System.out.println("Erro! O livro não esta disponivel para o emprestimo.");
        }
    }

    public void realizarDevolucao(){
        if (!livro.isDisponivel()){
            livro.setDisponivel(true);
            this.dataDevolucao = LocalDate.now();
            System.out.println("Devolucao realizado com sucesso!");
        }else {
            System.out.println("Erro! O livro não esta disponivel para a devolução.");
        }
    }

    @Override
    public String toString() {
        return "\nEmprestimo: " +
                "\nPessoa = " + pessoa.getNome() +
                "\nLivro = " + livro.getTitulo() +
                "\nData de Emprestimo = " + dataEmprestimo +
                "\nData de Devolucao = " + dataDevolucao;
    }
}
