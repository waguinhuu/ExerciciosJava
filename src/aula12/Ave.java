package aula12;

public class Ave extends Animal{
    private String corPele;

    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo peixe");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    public void fazerNinho(){
        System.out.println("Fazendo o ninho");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
