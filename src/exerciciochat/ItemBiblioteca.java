package exerciciochat;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void exibirInformacoes();

    public abstract void emprestar();

    public abstract void devolver();


    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        if(anoPublicacao > 0){
            this.anoPublicacao = anoPublicacao;
        }else {
            System.out.println("Ano de publicação inválida");
        }
    }




}
