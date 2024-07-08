package aula11;

public class ProgramaVeiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Start", 2024, 160);
        Carro carro= new Carro("Civic", "TyperR", 2023, 4);

        carro.exibirInfo();
        moto.exibirInfo();
        moto.passarMarcha();
    }
}
