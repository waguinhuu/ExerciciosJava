package exerciciochat;

public class Revista extends ItemBiblioteca{
    private String editora;
    private int numeroEdicao;

    public Revista(String titulo, int anoPublicacao, String editora, int numeroEdicao) {
        super(titulo, anoPublicacao);
        this.editora = editora;
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Editora: " + getEditora());
        System.out.println("Numero de edição: " + getNumeroEdicao());
    }

    @Override
    public void emprestar() {
        System.out.println("Revista " + getTitulo() + " emprestado");
    }

    @Override
    public void devolver() {
        System.out.println("Revista " + getTitulo() + " devolvido");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
}
