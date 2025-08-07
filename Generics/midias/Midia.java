public class Midia {
    public String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
    }
}
