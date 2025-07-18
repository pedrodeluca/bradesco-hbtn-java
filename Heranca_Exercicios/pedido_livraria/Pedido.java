public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total=0;

        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().getPrecoBruno()
                    + item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        if (percentualDesconto > 0) {
            total -= total * percentualDesconto / 100;
        }

        return total;
    }
}
