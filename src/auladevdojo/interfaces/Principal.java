package auladevdojo.interfaces;

public class Principal {
    public static void main(String[] args) {
        DatabaseLoader dl = new DatabaseLoader();
        FileLoader fl = new FileLoader();

        fl.load();
        fl.remove();
        fl.checkPermission();
        FileLoader.retrieveMaxDataSize();
        System.out.println("");
        dl.load();
        dl.remove();
        dl.checkPermission();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
