package aula07;

public class ExcLiv {
    public static void main(String[] args) {
        try {
            Livro l1 = new Livro("Harry potter", "J.K Rowling", 2001);
            l1.mostrarInformacoes();
            l1.emprestar();

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
