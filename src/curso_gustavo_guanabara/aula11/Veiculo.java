package curso_gustavo_guanabara.aula11;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public void exibirInfo(){
        System.out.printf("Marca: %s\n Modelo: %s\n Ano: %d\n", marca, modelo, ano);

    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }else{
            System.out.println("Erro! o ano tem que ser positivo");
        }

    }
}
