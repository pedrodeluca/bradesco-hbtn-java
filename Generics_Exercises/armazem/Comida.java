import static java.lang.String.format;

public class Comida {
    String nome;
    double calorias;
    double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String pre = format("%.6f", preco);
        String cal = format("%.6f", calorias);
        return "[" + nome + "] " + cal + " R$ " + pre;
    }
}
