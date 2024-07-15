package exerciciochat;

public class Dvd extends ItemBiblioteca{
    private String diretorDoDvd;
    private int duracaoDoDvd;

    public Dvd(String titulo, int anoPublicacao, String diretorDoDvd, int duracaoDoDvd) {
        super(titulo, anoPublicacao);
        this.diretorDoDvd = diretorDoDvd;
        this.duracaoDoDvd = duracaoDoDvd;
    }

    public String getDiretorDoDvd() {
        return diretorDoDvd;
    }

    public void setDiretorDoDvd(String diretorDoDvd) {
        this.diretorDoDvd = diretorDoDvd;
    }

    public int getDuracaoDoDvd() {
        return duracaoDoDvd;
    }

    public void setDuracaoDoDvd(int duracaoDoDvd) {
        if(duracaoDoDvd > 0){
            this.duracaoDoDvd = duracaoDoDvd;
        }else {
            System.out.println("Duração do dvd inválida");
        }

    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Diretor: " + getDiretorDoDvd());
        System.out.println("Duração: " + getDuracaoDoDvd());
    }

    @Override
    public void emprestar() {
        System.out.println("DVD " + getTitulo() + " emprestado");
    }

    @Override
    public void devolver() {
        System.out.println("DVD " + getTitulo() + " devolvido");
    }
}
