package orientadaobjetosv2;

public class Aula3C {
    public static void main(String[] args) {
        Conta  b1 = new Conta();

        b1.abrirConta("cc");
        b1.pagarMensal();
        b1.depositar(35);
        b1.sacar(20);
        b1.valores();
    }
}
