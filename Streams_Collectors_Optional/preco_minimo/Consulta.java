import java.util.List;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> livros = pedido.getProdutos().stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                .toList();

        return livros;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        Produto produtoMaiorPreco = produtos.stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())
        ).orElse(null);

        return produtoMaiorPreco;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        List<Produto> produtoPrecoMinimo = produtos.stream()
                .filter(p -> p.getPreco() >= precoMinimo)
                .toList();

        return produtoPrecoMinimo;
    }
}
