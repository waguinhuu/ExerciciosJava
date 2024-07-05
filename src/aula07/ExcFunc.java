package aula07;

public class ExcFunc {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Wagner", 5000, "Desenvolvedor");

        f1.mostrarStatus();
        f1.aumentoSalario(30);
        f1.mostrarStatus();
    }
}
