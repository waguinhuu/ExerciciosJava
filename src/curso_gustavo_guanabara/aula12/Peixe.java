package curso_gustavo_guanabara.aula12;

public class Peixe extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
