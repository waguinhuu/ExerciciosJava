package curso_gustavo_guanabara.aula07;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean emprestado;

    public Livro(String tit, String aut, int anoPu) {
        this.titulo = tit;
        this.autor = aut;
        this.setAnoDePublicacao(anoPu);
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        if(anoDePublicacao > 0){
            this.anoDePublicacao = anoDePublicacao;
        }else{
           // System.out.println("Ano de publicação inválido.");
            throw new RuntimeException("Ano de publicacao");
        }
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(){
        if(!this.getEmprestado()){
            this.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso");
        }else{
            System.out.println("Erro. Livro não pode ser emprestado");
        }
    }
    public void devolver(){
        if(this.getEmprestado()){
            this.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso");
        }else{
            System.out.println("Erro! livro ja devolvido");
        }
    }
    public void mostrarInformacoes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoDePublicacao());
        System.out.println("Emprestado: " + (getEmprestado() ? "Sim" : "Não"));

    }
}
