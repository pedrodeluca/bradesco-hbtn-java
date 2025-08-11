public interface Armazenavel<T> {
    void adicionarAoInventario(String chave, T valor);
    T obterDoInventario(String chave);
}
