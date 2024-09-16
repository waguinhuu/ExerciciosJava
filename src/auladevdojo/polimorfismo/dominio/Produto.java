package auladevdojo.polimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;
    protected String dataValidade;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
//        this.dataValidade = null;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
