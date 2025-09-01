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

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        List<Pedido> pedidosEletronicos = pedidos.stream()
                .filter(p -> p.getProdutos().stream()
                        .anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
                .toList();

        return pedidosEletronicos;
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
//        produtos.stream().forEach(p -> {
//            if (p.getCategoria() == CategoriaProduto.ELETRONICO) {
//                double desconto = p.getPreco() * 0.15;
//                p.setPreco(p.getPreco() - desconto);
//            }
//        });
        produtos.stream().map(p -> {
            if (p.getCategoria() == CategoriaProduto.ELETRONICO) {
                double desconto = p.getPreco() * 0.15;
                p.setPreco(p.getPreco() - desconto);
            }
            return null;
        }).toList();


        return produtos;
    }
}
