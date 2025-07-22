import provedores.JadLog;
import provedores.Loggi;
import provedores.ProvedorFrete;
import provedores.Sedex;

public class ProcessadorPedido {
    public ProvedorFrete provedorFrete;

    public ProcessadorPedido(Sedex sedex) {
        this.setProvedorFrete(sedex);
    }

    public ProcessadorPedido(JadLog jadLog) {
        this.setProvedorFrete(jadLog);
    }

    public ProcessadorPedido(Loggi loggi) {
        this.setProvedorFrete(loggi);
    }

    public void ProcessadorPedido(ProvedorFrete provedorFrete) {

    }

    public void processar(Pedido pedido) {

    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }
}
