package orientadaobjetosv2;

public class Aula3C {
    public static void main(String[] args) {
        Conta  b1 = new Conta("Wagner", 566);

        b1.abrirConta("cp");
        b1.pagarMensal();
        b1.sacar(200);
        b1.valores();
        b1.fecharConta();

        System.out.println(" ");

        Conta b2 = new  Conta("Luis", 988);
        b2.abrirConta("cc");
        b2.pagarMensal();
        b2.sacar(10);
        b2.valores();
        b2.fecharConta();
    }
}
