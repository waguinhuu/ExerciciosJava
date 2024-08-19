package auladevdojo.interfaces;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando arquivo...");
    }
    // -> Opcional subscrever o metodo estático
    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe FileLoader");
    }
}
