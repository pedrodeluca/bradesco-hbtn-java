package produtos;

public abstract class Produto {

    private String titulo;
    private int ano;
    private String pais;
    double precoBruno;

    public Produto(String titulo, int ano, String pais, double precoBruno) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruno = precoBruno;
    }

    public abstract double obterPrecoLiquido();

    public double getPrecoBruno() {
        return precoBruno;
    }

    public String getTitulo() {
        return titulo;
    }
}
