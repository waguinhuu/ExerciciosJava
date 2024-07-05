package aula07;

public class LivroP implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private Pessoa leitor;
    private boolean aberto;

    public String detalhes() {
        return "LivroP{" +
                "titulo=" + titulo +
                ", \nautor=" + autor +
                ", \ntotPaginas=" + totPaginas +
                ", \npagAtual=" + pagAtual +
                ", \nleitor=" + leitor.getNome() +
                ", \nidade=" + leitor.getIdade() +
                ", \nsexo=" + leitor.getSexo() +
                ", \naberto=" + aberto +
                '}';
    }

    public LivroP(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;

    }

    @Override
    public void avancarPag() {
        if(this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        }else{
            System.out.println("Nao é possivel avançar pagina.");
        }

    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.pagAtual >= 1) {
            this.pagAtual--;
        }else{
            System.out.println("Nao é possivel voltar a pagina");
        }

    }
}
