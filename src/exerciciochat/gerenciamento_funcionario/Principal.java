package exerciciochat.gerenciamento_funcionario;

public class Principal {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Wagner",5000,"Kotlin");
        Gerente gerente = new Gerente("Carlos",8000,"TI");

        System.out.println(desenvolvedor);
        System.out.println("Bônus: " + desenvolvedor.calcularBonus());

        System.out.println(gerente);
        System.out.println( "Bônus: " + gerente.calcularBonus());
    }
}
