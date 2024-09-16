package curso_gustavo_guanabara.aula11;

public class Carro extends Veiculo {
    private int numeroDePortas;

    @Override
    public void exibirInfo() {
        System.out.println("CARRO");
        super.exibirInfo();
        System.out.println("Numero de portas: " + getNumeroDePortas());
        System.out.println("-------------");
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

}
