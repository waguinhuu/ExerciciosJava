package auladevdojo.metodos.metodos_abstratos;

public class Principal {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Wagner", 12000);
        Gerente gerente = new Gerente("Paulo", 5000);

        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
