package auladevdojo.interfaces;

public interface DataRemover {
    void remove();
    default void checkPermission() {
        System.out.println("Fazendo Checagem");
    }
}
