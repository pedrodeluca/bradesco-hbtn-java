package provedores;

public class JadLog extends Frete implements ProvedorFrete {
    public JadLog() {
        super.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
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
