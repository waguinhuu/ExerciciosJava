package curso_gustavo_guanabara.aula12;

public class Cachorro extends Mamifero{

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    public void abanandoRabo(){
        System.out.println("Balançando o rabo...");
    }
    public void enterrarOsso(){
        System.out.println("Osso enterrado!");
    }
}
