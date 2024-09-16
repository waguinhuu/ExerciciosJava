package curso_gustavo_guanabara.orientadaobjetos.orientadaobjetosv2;

public class Aula3C {
    public static void main(String[] args) {
        Conta  b1 = new Conta();

        b1.setNumConta(1111);
        b1.setDono("Wagner Silva");
        b1.abrirConta("cc");
        b1.depositar(35);
        b1.sacar(40);
        b1.estadoAtual();

    }
}
