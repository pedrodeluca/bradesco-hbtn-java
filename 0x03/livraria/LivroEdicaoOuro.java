public class LivroEdicaoOuro extends Livro {
    public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.setPreco(preco);
    }

    @Override
    public double getPreco() {
        return (super.getPreco() * 30 / 100) + super.getPreco();
    }
}
