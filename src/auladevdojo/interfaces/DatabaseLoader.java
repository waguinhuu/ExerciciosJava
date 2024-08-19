package auladevdojo.interfaces;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
