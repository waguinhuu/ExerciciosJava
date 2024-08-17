package auladevdojo.enumeracao;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wagner", TipoCliente.FISICA);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
