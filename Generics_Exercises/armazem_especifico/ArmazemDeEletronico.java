public class ArmazemDeEletronico extends Armazem {
    public ArmazemDeEletronico() {
        super();
    }

    public ArmazemDeEletronico(String chave, Eletronico eletronico) {
        super.adicionarAoInventario(chave, eletronico);
    }

    public Eletronico obterDoInventario(String chave) {
        return (Eletronico) super.obterDoInventario(chave);
    }
}
