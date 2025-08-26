import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private Double preco;
    private int percentualMarkup = 10;

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    Supplier<Double> precoComMarkup = () -> preco + (preco * percentualMarkup / 100);
    Consumer<Double> atualizarMarkup = (novoValor) -> this.percentualMarkup = novoValor.intValue();
}
