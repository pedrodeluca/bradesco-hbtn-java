import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;

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

    public double calcularValorDesconto() {
        double total=0;

        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().getPrecoBruno()
                    + item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        if (percentualDesconto > 0) {
            return total * percentualDesconto / 100;
        }

        return 0;
    }

    public void apresentarResumoPedido() {
        double totalProdutos=0;

        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item: itens) {
            System.out.println("Tipo: " + item.getProduto().getClass().getName().replace("produtos.", "")
                    + "  Titulo: " + item.getProduto().getTitulo()
                    + "  Preco: " + String.format("%.2f",  Double.sum(item.getProduto().getPrecoBruno(), item.getProduto().obterPrecoLiquido()))
                    + "  Quant: " + item.getQuantidade()
                    + "  Total: " + String.format("%.2f", Double.sum(item.getProduto().getPrecoBruno(), item.getProduto().obterPrecoLiquido()) * item.getQuantidade()));

            totalProdutos += Double.sum(item.getProduto().getPrecoBruno(), item.getProduto().obterPrecoLiquido()) * item.getQuantidade();
        }

        System.out.println("----------------------------");

        System.out.println("DESCONTO: " + String.format("%.2f", calcularValorDesconto()));
        System.out.println("TOTAL PRODUTOS: " + String.format("%.2f", totalProdutos));

        System.out.println("----------------------------");

        System.out.println("TOTAL PEDIDO: " + String.format("%.2f", calcularTotal()));

        System.out.println("----------------------------");
    }
}
