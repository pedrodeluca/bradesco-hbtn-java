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
        return "[" + nome + "] " + calorias + " R$ " + preco;
    }
}
