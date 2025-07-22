package provedores;

public class Sedex extends Frete implements ProvedorFrete {
    public Sedex() {
        super.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);
    }

    @Override
    public Frete calcularFrete() {
        return null;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return null;
    }
}
