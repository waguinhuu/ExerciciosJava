package curso_gustavo_guanabara.aula13;

public class Mamifero extends Animal{
    private String CorPelo;


    @Override
    public void emitirSom() {
        System.out.println("Som do mamífero");

    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String corPelo) {
        CorPelo = corPelo;
    }
}
