public class ArmazemDeComida extends Armazem {
    public ArmazemDeComida() {
        super();
    }

    public ArmazemDeComida(String chave, Comida comida) {
        super.adicionarAoInventario(chave, comida);
    }

    public Comida obterDoInventario(String chave) {
        return (Comida) super.obterDoInventario(chave);
    }
}
