package exerciciochat.sistema_pedido_restaurante;

public class ItemPedido {
    public String nome;
    public double precoUnitario;
    public int quantidade;


    public ItemPedido(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calculaPreco(){
        return precoUnitario * quantidade;
    }

   }
