package produtos;

public class Livro  extends Produto {

    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruno, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruno);

        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido() {
        return super.precoBruno * 0.15;
    }
}
