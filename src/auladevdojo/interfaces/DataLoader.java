package auladevdojo.interfaces;

public interface DataLoader {
    void load();

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
