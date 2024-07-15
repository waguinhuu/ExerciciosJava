package exerciciochat;

public class Livro extends ItemBiblioteca {

    private String autor;
    private int numPag;

    public Livro(String titulo, int anoPublicacao, String autor, int numPag) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getNumPag());
    }

    @Override
    public void emprestar() {
        System.out.println("Livro " + getTitulo() + " emprestado");
    }

    @Override
    public void devolver() {
        System.out.println("Livro " + getTitulo() + " devolvido");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}
