package produtos;

public class Dvd extends Produto {

    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruno, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruno);

        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        return super.precoBruno * 0.20;
    }
}
