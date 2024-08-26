package exerciciochat.sistema_pedido_restaurante;

public class principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(101);

        ItemPedido item1 = new ItemPedido("Hambúrguer", 15.00,2 );
        ItemPedido item2 = new ItemPedido("Batata Frita",8.00 , 1 );
        ItemPedido item3 = new ItemPedido("Refrigerante", 5.00 ,2 );

        pedido.adicionarItens(item1);
        pedido.adicionarItens(item2);
        pedido.adicionarItens(item3);

        pedido.exibirPedido();

        pedido.mudarStatus(StatusPedidio.PREPARANDO);
        System.out.println("Status atualizado: " + pedido.status);

        pedido.mudarStatus(StatusPedidio.PRONTO);
        System.out.println("Status atualizado: " + pedido.status);

        pedido.mudarStatus(StatusPedidio.ENTREGUE);
        System.out.println("Status atualizado: " + pedido.status);

        System.out.println("\nResumo Final do Pedido:");
        pedido.exibirPedido();
    }
}
