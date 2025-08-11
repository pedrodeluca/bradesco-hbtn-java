import java.text.DecimalFormat;

public class Comida {
    String nome;
    int calorias;
    double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String caloriasFormatada = new DecimalFormat("0.000000").format(calorias);
        String precoFormatado = new DecimalFormat("0.000000").format(preco);
        return "[" + nome + "] " + caloriasFormatada + " R$ " + precoFormatado;
    }
}
