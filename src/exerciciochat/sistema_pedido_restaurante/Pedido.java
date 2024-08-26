package exerciciochat.sistema_pedido_restaurante;

import java.util.ArrayList;

public class Pedido {
    public int numeroPedido;
    ArrayList<ItemPedido> itens;
    public StatusPedidio status;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.status = StatusPedidio.REALIZADO;
    }

    public void adicionarItens(ItemPedido item) {
        itens.add(item);
    }

    public void mudarStatus(StatusPedidio novoStatus) {
        this.status = novoStatus;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calculaPreco();
        }
        return total;
    }
    public void exibirPedido() {
        System.out.println("Pedido nº " + numeroPedido + " - Status: " + status);
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.println(item.nome + " - Quantidade: " + item.quantidade + " - Preço: R$ " + item.precoUnitario);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
