public class Autor implements Comparable<Autor> {

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public int compareTo(Autor outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        return nome.equals(autor.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
