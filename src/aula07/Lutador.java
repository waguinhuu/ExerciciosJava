package aula07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double pe, double al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <=70.3) {
            this.categoria = "Leve";
        } else if (this.peso <=83.9) {
            this.categoria = "Médio";
        } else if (this.peso <=120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

   public void apresentar(){
       System.out.println("CHEGOU A HORA! Apresetamos o lutador: " + getNome());
       System.out.println("da origem: " + getNacionalidade());
       System.out.println("Com " + getIdade() + " Anos de idade");
       System.out.printf("Pesando %.2f Kg\n",getPeso() );
       System.out.printf("%.2f de altura\n", getAltura());
       System.out.println("N° de vitórias: " + getVitorias());
       System.out.println("N° de derrotas: " + getDerrotas());
       System.out.println("N° de empates: " + getEmpates());

    }
    public void status(){
        System.out.println(getNome() + " é um peso " + this.getCategoria());
        System.out.printf("Peso de %.2f Kg\n", getPeso());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");

    }
   public void ganharLuta(){
        setVitorias(getVitorias() +1);

    }
   public void perderLuta(){
        setVitorias(getDerrotas() +1);

    }
   public void empatarLuta(){
        setEmpates(getEmpates() +1);

    }
}
